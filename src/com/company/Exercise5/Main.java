package com.company.Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Main {
    /**
     * Declaration of attribute.
     */
    public static int option;
    public static boolean continuation = true;

    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);

        ArrayList<Motorcycle> myMotorcycles = new ArrayList<>();
        ArrayList<Car> myCars = new ArrayList<>();
        ArrayList<Bicycle> myBicycles= new ArrayList<>();
        ArrayList<Truck> myTrucks= new ArrayList<>();
        ArrayList<Boat> myBoats= new ArrayList<>();

        while (continuation){
        System.out.println("What type of vehicle do you want to add?");
        System.out.println("1.Motorcycle");
        System.out.println("2.Car");
        System.out.println("3.Bicycle");
        System.out.println("4.Truck");
        System.out.println("5.Boat");
        System.out.println("6.Exit");
        option = sc.nextInt();

        switch (option){
            case 1 -> {
                System.out.println("1. Write the id");
                int id = sc.nextInt();
                System.out.println("Write the date of enrollment");
                String enrollmentDate1 = st.nextLine();
                System.out.println("1. Write the time in seconds to get a velocity of 100 KM/h");
                double timeAccelerationTo100 = sc.nextDouble();
                myMotorcycles.add(new Motorcycle(id, 2 , 0, enrollmentDate1, "Road", "Yes", timeAccelerationTo100) );
                System.out.println(myMotorcycles);
            }

            case 2->{
                System.out.println("1. Write the id");
                int id = sc.nextInt();
                System.out.println("1. Write the maximum quantity of passengers");
                int passengers = sc.nextInt();
                System.out.println("Write the date of enrollment");
                String enrollmentDate = st.nextLine();
                System.out.println("Write the kind of type");
                String fuelType = st.nextLine();

                  myCars.add( new Car(id, passengers, 4, enrollmentDate, "road", "yes", fuelType) );
                System.out.println(myCars);
            }

            case 3 ->{
                System.out.println("1. Write the id");
                int id = sc.nextInt();
                System.out.println("Write the date of enrollment");
                String enrollmentDate1 = st.nextLine();
                System.out.println("1. Write the bicycle's color");
                String color = st.nextLine();
                myBicycles.add(new Bicycle(id, 2 , 0, enrollmentDate1, "Road", "Yes", color) );
                System.out.println(myBicycles);

            }

            case 4->{
                System.out.println("1. Write the id");
                int id = sc.nextInt();
                System.out.println("1. Write the maximum capacity of passengers");
                int passengers = sc.nextInt();
                System.out.println("Write the date of enrollment");
                String enrollmentDate1 = st.nextLine();
                System.out.println("1. Write the truck's height");
                double height = sc.nextDouble();
                myTrucks.add(new Truck(id, passengers , 2, enrollmentDate1, "Road", "Yes", height) );
                System.out.println(myTrucks);

            }

            case 5 ->{
                System.out.println("1. Write the id");
                int id = sc.nextInt();
                System.out.println("1. Write the maximum capacity of passengers");
                int passengers = sc.nextInt();
                System.out.println("Write the date of enrollment");
                String enrollmentDate1 = st.nextLine();
                System.out.println("1. Write the maximum nautical mile of the boat");
                int maximumNauticalMile = sc.nextInt();
                myBoats.add(new Boat(id, passengers , 0, enrollmentDate1, "Sea", "Yes", maximumNauticalMile) );
                System.out.println(myBoats);
            }

            case 6 -> {
                continuation = false;
            }

        }
        }









    }
}
