package com.example.hussienalrubaye.quranonline;

import android.Manifest;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;


public class RecitesName extends AppCompatActivity {
   public ArrayList<AuthorClass> listrecites = new ArrayList<AuthorClass>();
    ListView lVRecites;
    InterstitialAd mInterstitialAd;
    String RecitesName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recites_name);
        // check if he load for first time to selling the language
        SaveSettings sv = new SaveSettings(this);
        sv.LoadData();


        lVRecites = (ListView) findViewById(R.id.listView);
//get list of recites
        LnaguageClass lc = new LnaguageClass();
        listrecites = lc.AutherList();
        lVRecites.setAdapter(new VivzAdapter(listrecites));
        lVRecites.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //load recites aya
                TextView txtRecitesName = (TextView) view.findViewById(R.id.txtRecitesName);
               // AuthorClass temp = listrecites.get(position);
                for (AuthorClass listrecitesitem : listrecites) {
                    if (listrecitesitem.RealName.equals(txtRecitesName.getText())) {
                        RecitesName = listrecitesitem.ServerName;
                       // String welcomes = listrecitesitem.ServerName;
                        DisplayAya();
                        break;
                    }
                }

            }
        });
        if(SaveSettings.OnTimeAds==false) {
            if(SaveSettings.IsRated==1){
            SaveSettings.OnTimeAds=true;
            }

        }
    }


    private void DisplayAya() {
        //check permison
        if ((int) Build.VERSION.SDK_INT >= 23)
        {
            if ((ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                    PackageManager.PERMISSION_GRANTED)||
                    ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) !=
                            PackageManager.PERMISSION_GRANTED)
            {
                     requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE},
                            REQUEST_CODE_ASK_PERMISSIONS);

                return;
            }

        }
        //permisons

        ListAya();
    }
    void ListAya(){
        try{
            if(    RecitesName.length()>1){
                Intent intent = new Intent(this, AyaList.class);
                intent.putExtra("RecitesName",RecitesName);
                startActivity(intent);}
        }catch (Exception ex)
        {}
    }




    SearchView searchView;
    Menu myMenu;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recites_name, menu);
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
                for ( AuthorClass  listrecitesitem:  listrecites) {
                    if (listrecitesitem.RealName.contains(newText)) {
                        listrecitestemp.add(listrecitesitem);

                    }
                }
                lVRecites.setAdapter(new VivzAdapter(listrecitestemp));
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

        if (id == R.id.menu) {
            Intent intent = new Intent(this, Sellings.class);
            startActivity(intent);

        }


        return super.onOptionsItemSelected(item);
    }




    class VivzAdapter extends BaseAdapter {

        ArrayList<AuthorClass> listrecitesLocal;

        VivzAdapter(ArrayList<AuthorClass> listrecites) {

            listrecitesLocal = new ArrayList<AuthorClass>();
            listrecitesLocal = listrecites;

        }


        @Override
        public int getCount() {
            return listrecitesLocal.size();
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
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater mInflater = getLayoutInflater();
            View myView = mInflater.inflate(R.layout.recites_ticket, null);
            TextView txtRecitesName = (TextView) myView.findViewById(R.id.txtRecitesName);
            AuthorClass temp = listrecitesLocal.get(position);
            txtRecitesName.setText(temp.RealName);
            return myView;

        }


    }

    //get access to mailbox
    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        switch (requestCode)
        {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {

                    ListAya();
                } else {
                    // Permission Denied
                    ListAya();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}
