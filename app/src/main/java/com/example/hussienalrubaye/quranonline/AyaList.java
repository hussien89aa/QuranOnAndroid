package com.example.hussienalrubaye.quranonline;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;


public class AyaList extends AppCompatActivity {
    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    ListView listAya;
    public static ArrayList<AuthorClass> listrecitesAya = new ArrayList<AuthorClass>();
    private ProgressDialog mProgressDialog;
    LinearLayout LayoutLoading;
    ProgressBar progressBar;
    static  String RecitesName="";
    String RecitesAYA="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aya_list);
        //get Recites
        Bundle b=getIntent().getExtras();
        RecitesName=b.getString("RecitesName");
        listAya =(ListView) findViewById ( R.id.listView) ;
//get list of recites
        listrecitesAya.clear();
        LnaguageClass lc = new LnaguageClass();
        listrecitesAya = lc.GuranAya(RecitesName);
        listAya.setAdapter(new VivzAdapter(listrecitesAya));
        LayoutLoading=(LinearLayout)findViewById(R.id.LayoutLoading);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        LayoutLoading.setVisibility(View.GONE);

    }
    private void DisplayAya(){
        Intent intent= new Intent( this,managerdb.class);
        intent.putExtra("RecitesName",RecitesName);
        intent.putExtra("RecitesAYA",RecitesAYA);
        startActivity(intent);
    }
public void LoadAya(){
    ListView list =(ListView) findViewById ( R.id.listView) ;

//get list of recites
    LnaguageClass lc = new LnaguageClass();
    listrecitesAya = lc.GuranAya(RecitesName);
    listAya.setAdapter(new VivzAdapter(listrecitesAya));


}


    SearchView searchView;
    Menu myMenu;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aya_list, menu);
        myMenu=menu;
        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        //final Context co=this;
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<AuthorClass> listrecitestemp = new ArrayList<AuthorClass>();
                for (AuthorClass listrecitesitem : listrecitesAya) {
                    if (listrecitesitem.RealName.contains(newText)) {
                        listrecitestemp.add(listrecitesitem);

                    }
                }
                listAya .setAdapter(new VivzAdapter(listrecitestemp));
                return false;
            }
        });
        //   searchView.setOnCloseListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.gbackmenu) {

            // rate app
            if( ISDonwloading!=true) //it he isnot donlaidng know
            if(SaveSettings.IsRated==0) {
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case DialogInterface.BUTTON_POSITIVE:
                                //Yes button clicked
                                Uri uri = Uri.parse("market://details?id=" + SaveSettings.APPURL);
                                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                                // To count with Play market backstack, After pressing back button,
                                // to taken back to our application, we need to add following flags to intent.
                                goToMarket.addFlags(
                                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                                try {
                                    startActivity(goToMarket);
                                } catch (ActivityNotFoundException e) {
                                    startActivity(new Intent(Intent.ACTION_VIEW,
                                            Uri.parse("http://play.google.com/store/apps/details?id=" + SaveSettings.APPURL)));
                                }
                                SaveSettings.IsRated = 1;
                                SaveSettings sv = new SaveSettings(getApplicationContext());
                                sv.SaveData();
                                finish();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                //No button clicked
                                finish();
                                break;
                        }
                    }
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(getResources().getString(R.string.rateq)).setPositiveButton("Yes", dialogClickListener)
                        .setNegativeButton("No", dialogClickListener).show();
            }
            else{
                finish();
            }
            }

        return super.onOptionsItemSelected(item);
    }
/// file downlaod
public void startDownload( String ImgUrl,String ServerName ) {
    RecitesAYA=ServerName;
    String url = ImgUrl ;// "http://farm1.static.flickr.com/114/298125983_0e4bf66782_b.jpg";
    new DownloadFileAsync().execute(url);
}
    /*
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_DOWNLOAD_PROGRESS:
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setMessage("Downloading file..");
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                mProgressDialog.setCancelable(false);
                mProgressDialog.show();
                return mProgressDialog;
            default:
                return null;
        }
    }*/
public  boolean ISDonwloading=false;
    class DownloadFileAsync extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            LayoutLoading.setVisibility(View.VISIBLE);
            progressBar.setProgress(0);
            progressBar.setMax(100);
            ISDonwloading=true;

           // showDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                //Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                String SDPath = Environment.getExternalStorageDirectory().getPath() + "/";
                OutputStream output = new FileOutputStream(SDPath+  RecitesName+ RecitesAYA +".mp3");

                byte data[] = new byte[1024];

                long total = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress(""+(int)((total*100)/lenghtOfFile));
                    output.write(data, 0, count);
                }

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {}
            return null;

        }
        protected void onProgressUpdate(String... progress) {
           // Log.d("ANDRO_ASYNC",progress[0]);
            //mProgressDialog.setProgress(Integer.parseInt(progress[0]));
            progressBar.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            LoadAya();
            //dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
            LayoutLoading.setVisibility(View.GONE);
            ISDonwloading=false;

        }
    }
    //=====================================
    class VivzAdapter extends BaseAdapter
    {




        ArrayList<AuthorClass> listrecitesLocal;

        VivzAdapter(ArrayList<AuthorClass> listrecites) {

            listrecitesLocal = new ArrayList<AuthorClass>();
            listrecitesLocal = listrecites;

        }


        @Override
        public int getCount() {
            return this.listrecitesLocal.size();
        }

        @Override
        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater mInflater = getLayoutInflater();
            View row = mInflater.inflate(R.layout.single_rowayalist, null);

            TextView title=(TextView) row.findViewById( R.id.textView1);
            TextView cost=(TextView) row.findViewById( R.id.textView2);
            ImageView image =(ImageView) row.findViewById( R.id.imageView);
            Button budownload =(Button) row.findViewById( R.id.button);
          //  budownload.setBackground(getResources().getDrawable(R.drawable.buttonred)) ; // "@drawable/buttonred");
            final    AuthorClass temp=this.listrecitesLocal.get(i);
            final int postion =i;
 //final  String linkaya=temp.ImgUrl;
            final  String  ServerName =temp.ServerName;
            /*
            //check if SD availbel
            Boolean isSDPresent = android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);

            if(isSDPresent)
            {
                // yes SD-card is present
               // budownload.setEnabled(true);
                budownload.setVisibility(View.VISIBLE);
            }
            else
            {  // No SD-card is present;
                budownload.setVisibility(View.GONE);

            }*/
            // if already dowload
            if(temp.StateName.equals(LnaguageClass.avalible()))
                budownload.setVisibility(View.INVISIBLE);
            // downlaod file
            budownload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

if( ISDonwloading!=true)
                    startDownload(temp.ImgUrl,ServerName );
                   // Toast.makeText(this, linkaya, Toast.LENGTH_LONG).show();
                }
            });
            //=====================================================
image.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        //get aya
        if( ISDonwloading!=true)
        for (int i=0;i< listrecitesAya.size();i++) {
            if(listrecitesAya.get(i).RealName.equals(temp.RealName)){
                RecitesAYA=String.valueOf(i);// ServerName;
                DisplayAya();
                break;
            }

        }

    }
});
            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //get aya
                    if( ISDonwloading!=true)
                    for (int i=0;i< listrecitesAya.size();i++) {
                        if(listrecitesAya.get(i).RealName.equals(temp.RealName)){
                             RecitesAYA=String.valueOf(i);// ServerName;
                            DisplayAya();
                            break;
                        }

                    }
                }
            });


            budownload.setText(getResources().getString(R.string.downlaod));
            title.setText(temp.RealName);
            cost.setText(temp.StateName);// it updated
            //image.setImageResource(temp.ImgUrl);

            return row;






        }



    }
}
