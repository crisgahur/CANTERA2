package com.company;
import java.util.ArrayList;
import java.util.Date;

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
public class Songs {

    /**
     * Declaration of attributes.
     */

    public String name;
    public int id;
    public String date;
    public String description;
    public int duration;
    public String genre;
    public String cover;
    public ArrayList<String> Songs;



    /**
     *
     * @param name : title of the song.
     * @param id : identification
     * @param description:
     * @param duration
     * @param genre
     * @param cover
     */
    public Songs(String name, int id, String description, int duration, String genre, String cover,int day , int month , int year) {
        Date Date = new Date();
        this.name = name;
        this.id = id;
        this.date = day + "/" + month +"/" + year;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
    }
}
