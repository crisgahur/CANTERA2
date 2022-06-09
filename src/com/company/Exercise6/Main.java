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
    public static int number;
    public static boolean continuation = true;

    public static void main(String[] args) {

        int[] array = new int[100];
        Scanner sc = new Scanner(System.in);


 while (continuation){
        for (int i = 0; i < array.length; i++){
            System.out.println("Write a number");
            number = sc.nextInt();
            array[i] = number;

            for (int j = 0; j < array.length; j++) {

                if(i != j && (array[i] == array[j])){
                    System.out.println("Number Repeated \n");
                    System.out.println("End");
                    continuation = false;
                }
                else{
                    continuation = true;
                }

            }
        }
        }
    }
}
