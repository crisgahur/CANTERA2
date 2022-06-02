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
    public Date date;
    public String description;
    public int duration;
    public String genre;
    public String cover;
    public ArrayList<String> Songs;



    /**
     *
     * @param name : title of the song.
     * @param id : identification
     * @param date : publicacion
     * @param description:
     * @param duration
     * @param genre
     * @param cover
     */
    public Songs(String name, int id, Date date, String description, int duration, String genre, String cover) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
    }
}
