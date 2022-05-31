package com.company;

/**
 * It's a package to create different kinds of spacecrafts.
 * @author Cristian Gallego Hurtado
 */

import java.util.Scanner;

public class Main {

    /**
     * Declaration of attributes to do the method of continues creating new spacecrafts.
     */
    static boolean continues = true ;
    static String continues2;

    /**
     *
     * @param again attribute to compare with the request of the user.
     * @return according to the conditional, the user could continues or not creating new spacecrafts.
     */

    public static boolean continuation(String again){

    if (again.equals("yes")){
        return true;
    }
        else{
        return false;
    }
    }

    /**
     *
     * @param args main class.
     */

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);
        int option;

        while (continues){

            System.out.println("What kind of spacecraft do you would add?");
            System.out.println("1. Cargo");
            System.out.println("2. Manned");
            System.out.println("3. Satellite");
            option = entry2.nextInt();
            switch (option){

                case 1:
                    Cargo test1 = new Cargo();
                    System.out.println(test1.getName());
                    System.out.println(test1.getObjective());
                    System.out.println(test1.getPower());
                    System.out.println(test1.getCapacity());
                    System.out.println(test1.getFuelType());
                    System.out.println(test1.getWeight());
                    System.out.println("Would you like add more?");
                    continues2 = entry.nextLine();
                    continues2.toLowerCase();
                    continuation(continues2);
                    break;

                case 2:
                    Manned test2 = new Manned();
                    System.out.println(test2.getName());
                    System.out.println(test2.getObjective());
                    System.out.println(test2.getPower());
                    System.out.println(test2.getCapacity());
                    System.out.println(test2.getFuelType());
                    System.out.println(test2.getWeight());
                    System.out.println("Would you like add more?");
                    continues2 = entry.nextLine();
                    continues2.toLowerCase();
                    continuation(continues2);
                    break;

                case 3:
                    Satellite test3 = new Satellite();
                    System.out.println(test3.getName());
                    System.out.println(test3.getObjective());
                    System.out.println(test3.getPower());
                    System.out.println(test3.getCapacity());
                    System.out.println(test3.getFuelType());
                    System.out.println(test3.getWeight());
                    System.out.println("Would you like add more?");
                    continues2 = entry.nextLine();
                    continues2.toLowerCase();
                    continuation(continues2);
                    break;

            }
        }
    }
}
