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

public class Main {

    public static void main(String[] args) {

        Songs s1 = new Songs("la paz",10 ,"song about the peace" ,120, "vals" , "/path/img/cover.jpg",1,6,2022);
        System.out.println(s1.date);
    }
}
