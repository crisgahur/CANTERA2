package com.company.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @version 1.01.001 2022-06-06.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Main {
    public static double result;
    static public int option, election1, election2;
    static Scanner getInt = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Planet> myPlanets = new ArrayList<>();
        myPlanets.add(new Planet(3285, 5.43, 4879.4, 58000000, 1, "Mercury"));
        myPlanets.add(new Planet(4867, 5.24, 12104, 108200000, 2, "Venus"));
        myPlanets.add(new Planet(5972, 5.51, 12742, 149600000, 3, "Earth"));
        myPlanets.add(new Planet(6420, 3.93, 6779, 227940000, 4, "Mars"));
        myPlanets.add(new Planet(9232, 1.33, 139820, 778330000, 5, "Jupiter"));




    while (Planet.program){

        System.out.println("Welcome, choose what you want to do:");
        System.out.println("1. Show me all the planets ");
        System.out.println("2. Calculate the gravitational attraction between two of them");
        System.out.println("3. Exit");
        option = getInt.nextInt();

        switch (option) {
            case 1 -> System.out.println(myPlanets);
            case 2 -> {
                System.out.println(myPlanets);
                System.out.println("Write the id of the first planet");
                election1 = getInt.nextInt();
                if ((election1 > 0) && (election1 < 6)) {
                    System.out.println("Write the id of the second planet");
                    election2 = getInt.nextInt();

                    if ((election2 > 0) && (election2 < 6)) {
                        result = (myPlanets.get(election1 - 1)).gravAttraction((myPlanets.get(election1 - 1).getMass()), (myPlanets.get(election2 - 1).getMass()), (myPlanets.get(election1 - 1).getDistanceToSun()), (myPlanets.get(election2 - 1).getDistanceToSun()));
                        System.out.println(result);
                    } else {
                        System.out.println("Choice of the second planet incorrect");
                    }
                } else {
                    System.out.println("Choice of the first planet incorrect");
                }
            }
            case 3 -> Planet.program = false;
        }
        }





    }


    }





