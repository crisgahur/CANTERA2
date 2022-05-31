package com.company;

/**
 * It's a class to create one of the several kinds of spacecrafts.
 * @author Cristian Gallego Hurtado
 */


import java.util.Scanner;

public abstract class Spacecraft {
    /**
     * Declaration of attributes
     */

    public String name;
    public String objective;
    public int power;
    public int weight;
    public String fuelType;
    public int capacity;
    static boolean continues = true ;
    static String continues2;

    /**
     * Methods to assign values.
     */
    Scanner entry = new Scanner(System.in);
    Scanner entry2 = new Scanner(System.in);


    /**
     * Abstract classes.
     * @return return the values than the user will assign to the attributes.
     */

    public abstract String getName();
    public abstract String getObjective();
    public abstract int getPower();
    public abstract int getWeight();
    public abstract String getFuelType();
    public abstract int getCapacity();





}
