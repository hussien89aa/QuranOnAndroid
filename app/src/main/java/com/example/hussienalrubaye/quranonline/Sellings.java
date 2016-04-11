package com.example.hussienalrubaye.quranonline;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class Sellings extends AppCompatActivity {


    ArrayList<SettingItem> fullsongpath =new ArrayList<SettingItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellings);
          fullsongpath.add(new SettingItem(getResources().getString(R.string.separeteapp), R.drawable.network));

        fullsongpath.add(new SettingItem(getResources().getString(R.string.rateapp), R.drawable.social));
        //intiixae items
      //  fullsongpath.add(new SettingItem(getResources().getString(R.string.Languages), R.drawable.menu));

        ListView ls=( ListView) findViewById(R.id.listView);
        ls.setAdapter(new MyCustomAdapter());
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {


                    switch (position) {

                        case 0:
                        {
                            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                            sharingIntent.setType("text/plain");
                            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml(getResources().getString(R.string.sharemessage) + "  https://play.google.com/store/apps/details?id=" + SaveSettings.APPURL + ""));
                            startActivity(Intent.createChooser(sharingIntent, "Share using"));
                        } break;

                        case 1:
                        {
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

                        }
                        break;


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_managerdb, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.gbackmenu) { // stoped
            // Intent intent=new Intent(this,MainActivity.class);
            //startActivity(intent);
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    // adapter for song list
    private class MyCustomAdapter extends BaseAdapter {


        public MyCustomAdapter() {

        }


        @Override
        public int getCount() {
            return fullsongpath.size();
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

            final   SettingItem s = fullsongpath.get(position);

            if((position==2) ){

                View myView = mInflater.inflate(R.layout.setting_item_alert, null);
                final Switch swNotify=(Switch)myView.findViewById(R.id.switch1);
                swNotify.setChecked( SaveSettings.LanguageSelect==1?true:false);
                swNotify.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SaveSettings.LanguageSelect = isChecked == true ? 1 : 2;
                        SaveSettings sv = new SaveSettings(getApplicationContext());
                        sv.SaveData();
                    }
                });
                return myView;
            }

            else
            {
                View myView = mInflater.inflate(R.layout.settingitem, null);
                TextView textView = (TextView) myView.findViewById(R.id.textView);
                textView.setText(s.Name);
                ImageView img=(ImageView)myView.findViewById(R.id.imgchannel);
                img.setImageResource(s.ImageURL);
                return myView;}
        }
    }
}
