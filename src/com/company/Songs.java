package com.company;

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

    public Songs(String name, int id, String date, String description, int duration, String genre, String cover) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
    }

    public void filterGenre(){

    };
    public void filterDate(){

    };
}
