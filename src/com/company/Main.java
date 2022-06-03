package com.company;
import java.util.*;

/**
 * Main class,
 *
 *
 * @version 1.05.003 2022-06-01.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 * @author Juan Pablo Tabares Gallego - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Main {

    static Scanner getString = new Scanner(System.in);
    static Scanner getInt = new Scanner(System.in);
    static public int option;
    static public String option3;
    public static Songs[] allSongs = new Songs[5];
    public static Songs[] playList = new Songs[3];

    public static void main(String[] args) {

        Songs song1 = new Songs("GASOLINA", 2,20,2,2002,"Latin music" , 5 , "reggaeton" , "/path/img/cover1.jpg" );
        Songs song2 = new Songs("EL CANTANTE", 2,12,2,1957,"Salsa music to enjoy",4,"salsa", "/path/img/cover2.jpg");
        Songs song3 = new Songs("BEAT IT", 2,2,10,1969,"Pop music to dance with friends",3,"pop","/path/img/cover3.jpg");
        Songs song4 = new Songs("YOUR LOVE", 2,20,3,1960,"Rock music to enjoy with friends",3,"rock", "/path/img/cover4.jpg");
        Songs song5 = new Songs("PLASTICO", 2,6,12,1947,"Salsa music to enjoy.", 6,"salsa","/path/img/cover5.jpg");

        List<Songs> list= Arrays.asList(song1, song2, song3, song4, song5);
        allSongs[0] = song1;


        System.out.println("Welcome to the app music, please choose what you would to do: ");
        System.out.println("1. Show me the main library");
        System.out.println("2. Create a new playlist");
        System.out.println("3. Show me a playlist");
        System.out.println("4. Desconectarse");
        option = getInt.nextInt();
        switch (option){
            case 1 :
                //MAIN LIBRARY
                songsList("1. ", song1.getName(), song1.getDuration(), song1.genre, song1.date);
                songsList("2. ", song2.getName(), song2.getDuration(), song2.genre, song2.date);
                songsList("3. ", song3.getName(), song3.getDuration(), song3.genre, song3.date);
                songsList("4. ", song4.getName(), song4.getDuration(), song4.genre, song4.date);
                songsList("5. ", song5.getName(), song5.getDuration(), song5.genre, song5.date);

                System.out.println("CHOOSE WHAT DO YOU WOULD TO FILTER:");
                System.out.println("1. GENRE");
                System.out.println("2. YEAR");
                option = getInt.nextInt();

                switch (option){
                    case 1:
                System.out.println("WRITE THE GENRE:");
                option3 = getString.next();

                ArrayList<String> filteredResult = new ArrayList<>();

                for (Songs songs: list) {
                    if (songs.genre.equals(option3)) {

                        filteredResult.add("Name: " + songs.getName() + "\n" + "Duration: " + songs.getDuration() + " Min " +  "\n" + "Song year: " + songs.date + "\n \n" );
                    }
                }

                        System.out.println("Filtered Result:\n"+ filteredResult.toString());

                }
                 break;
            case 2 :
                //CREATE LIBRARY OPTION
                System.out.println("WRITE YOURS LIBRARY'S NAME");
                //leer nombre

                for(int i = 0; i <= 3; i++){
                    if(playList[i] == null){
                        playList[i] = allSongs[chosenSong(song1.getName(), song2.getName(), song3.getName(), song4.getName(), song5.getName())-1];
                    }
                }
                break;

            case 3:

                }



        }



    private static void songsList(String num,String name , float time, String type, String day){
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
