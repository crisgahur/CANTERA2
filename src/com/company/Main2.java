package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main2 {
    static public String option3;

    public static void main(String[] args) {


        Songs song1 = new Songs("GASOLINA", 2,"20-03-2002","Reggaeton music to dance in parties",3,"reggaeton","/path/img/cover1.jpg" );
        Songs song2 = new Songs("EL CANTANTE", 2,"12-10-1987","Salsa music to enjoy",3,"salsa","/path/img/cover2.jpg");
        Songs song3 = new Songs("BEAT IT", 2,"23-07-1995","Pop music to dance with friends",3,"pop","/path/img/cover3.jpg");
        Songs song4 = new Songs("YOUR LOVE", 2,"20-03-2002","Rock music to enjoy with friends",3,"rock","/path/img/cover4.jpg");
        Songs song5 = new Songs("PLASTICO", 2,"06-12-1997","Salsa music to enjoy.",3,"salsa","/path/img/cover5.jpg");

        List<Songs> list= Arrays.asList(song1, song2, song3, song4, song5);

        var filteredResult = new ArrayList<Songs>();

        for (Songs songs: list) {
            if (songs.genre) == ""option3"") {

                filteredResult.add(songs);
            }
        }

        System.out.println("Filtered Result:\n"+filteredResult.toString());
    }
}
