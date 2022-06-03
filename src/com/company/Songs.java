package com.company;

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
public class Songs {

    /**
     * Declaration of attributes.
     */
    private String name;
    private int id;
    private int day;
    private int month;
    private int year;
    private String description;
    private float duration;
    public String genre;
    private String cover;
    public String date;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public float getDuration() {
        return duration;
    }

    public String getCover() {
        return cover;
    }

    public Songs(String name, int id, int day, int month, int year, String description, int duration, String genre, String cover) {
        this.name = name;
        this.id = id;
        this.date = day + "/" + month + "/" + year;
        this.day = day;
        this.month = month;
        this.year = year;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
    }
}
