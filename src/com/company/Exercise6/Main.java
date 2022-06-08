package com.company.Exercise6;

import java.util.Scanner;

/**
 * Main class to create an array number, where the user write numbers until there's one repeat.
 *
 * @version 1.01.001 2022-06-08.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */


public class Main {
    public static int number,number2 ;

    public static void main(String[] args) {

        int[] array = new int[100];
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < array.length; i++){

            System.out.println("Write a number");
            number = sc.nextInt();
            array[i] = number;

            for (int j = 0; j < array.length; j++) {
                System.out.println("Write a number");
                number2 = sc.nextInt();
                array[j] = number2;

                if(array[i] == array[j]){
                    System.out.println("");
                }
            }




        }


    }
}
