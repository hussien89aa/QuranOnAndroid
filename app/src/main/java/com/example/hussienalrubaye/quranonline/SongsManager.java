package com.example.hussienalrubaye.quranonline;

/**
 * Created by hussienalrubaye on 12/26/15.
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class SongsManager {
    // SDCard Path
    final String MEDIA_PATH = new String("/sdcard/");
    private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();

    // Constructor
    public SongsManager(){

    }

    /**
     * Function to read all mp3 files from sdcard
     * and store the details in ArrayList
     * */
    public ArrayList<HashMap<String, String>> getPlayList(String  RecitesName){
        File home = new File(MEDIA_PATH);

        ArrayList<AuthorClass> list=new ArrayList<AuthorClass>();
        LnaguageClass lc=new LnaguageClass();
        list=lc.GuranAya(RecitesName);
        for(AuthorClass temp:list){

/// / MainActivity.PathQuran="http://www.mp3quran.net/newMedia.php?id=" + String.valueOf(IDSelect) + "&file=http://server11.mp3quran.net/" + MajorDeprtment + "/" +  IDString + ".mp3";
            HashMap<String, String> song = new HashMap<String, String>();
            song.put("songTitle", temp.RealName  );
            song.put("songPath",   temp.ImgUrl  );

            // Adding each song to SongList
            songsList.add(song);
        }


        // return songs list array
        return songsList;
    }

    /**
     * Class to filter files which are having .mp3 extension
     * */
    class FileExtensionFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            return (name.endsWith(".mp3") || name.endsWith(".MP3"));
        }
    }
}
