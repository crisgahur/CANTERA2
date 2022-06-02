package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class,
 *
 *
 * @version 1.01.001 2022-06-01.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 * @author Juan Pablo Tabares Gallego - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Main {

    static Scanner getString = new Scanner(System.in);
    static public int option;
    public static Songs[] allSongs = new Songs[5];
    public static Songs[] playList = new Songs[3];

    public static void main(String[] args) {

        Songs song1 = new Songs("GASOLINA", 2,"20-03-2002","LOVE",3,"reggaeton","/path/img/cover1.jpg");
        Songs song2 = new Songs("GASOLINA", 2,"20-03-2002","LOVE",3,"reggaeton","/path/img/cover1.jpg");
        Songs song3 = new Songs("GASOLINA", 2,"20-03-2002","LOVE",3,"reggaeton","/path/img/cover1.jpg");
        Songs song4 = new Songs("GASOLINA", 2,"20-03-2002","LOVE",3,"reggaeton","/path/img/cover1.jpg");
        Songs song5 = new Songs("GASOLINA", 2,"20-03-2002","LOVE",3,"reggaeton","/path/img/cover1.jpg");

        allSongs[0] = song1;


        switch (1){
            case 1 :
                //MAIN LIBRARY
                songsList("1. ", song1.name, song1.duration, song1.genre, song1.date);
                songsList("2. ", song2.name, song2.duration, song2.genre, song2.date);
                songsList("3. ", song3.name, song3.duration, song3.genre, song3.date);
                songsList("4. ", song4.name, song4.duration, song4.genre, song4.date);
                songsList("5. ", song5.name, song5.duration, song5.genre, song5.date);

                break;

            case 2 :
                //CREATE LIBRARY OPTION
                System.out.println("WRITE YOURS LIBRARY'S NAME");
                //leer nombre

                for(int i = 0; i <= 3; i++){
                    if(playList[i] == null){
                        playList[i] = allSongs[chosenSong(song1.name, song2.name, song3.name, song4.name, song5.name)-1];
                    }
                }


        }

    }

    private static void songsList(String num,String name , int time, String type, String day){
        System.out.println(num + name + " \n  Duration: " + time + "  Min" + " \n  Genre: " + type + " \n  Date " + day);
    }

    private static int chosenSong(String name1, String name2, String name3 , String name4, String name5){
        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.println("4. " + name4);
        System.out.println("5. " + name5);
        return getString.nextInt();
    }
}

