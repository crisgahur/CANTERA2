package com.company.Exercise3;

/**
 * Main class to create an array number, where the user can choose if wants a bubble sort or a quick sort method.
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

import java.util.Scanner;
public class Main {
    /**
     * Declaration of attributes.
     */
    public static int i, j, aux, option, pos;
    static Scanner getInt = new Scanner(System.in);
    public static boolean operation = true;

    public static void main(String[] args) {

        int[] array = new int[11];
        array[0] = (int) (Math.random()*100+1);
        array[1] = (int) (Math.random()*100+1);
        array[2] = (int) (Math.random()*100+1);
        array[3] = (int) (Math.random()*100+1);
        array[4] = (int) (Math.random()*100+1);
        array[5] = (int) (Math.random()*100+1);
        array[6] = (int) (Math.random()*100+1);
        array[7] = (int) (Math.random()*100+1);
        array[8] = (int) (Math.random()*100+1);
        array[9] = (int) (Math.random()*100+1);
        array[10] = (int) (Math.random()*100+1);


        System.out.println("Randomly generated numbers:");
        for(i = 0; i < 11; i++ )
        {
            System.out.print(array[i]+ ", ");

       }

        while (operation){
        System.out.println("");
        System.out.println("");
        System.out.println("Please choose the order of numbers you want: ");
        System.out.println("1.Bubble sort ");
        System.out.println("2.Quick sort ");


        option = getInt.nextInt();
            switch (option) {
                case 1 -> {
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 10; j++)
                            if (array[j] > array[j + 1]) {
                                aux = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = aux;
                            }
                    }
                    System.out.println("Array in bubble sort:");
                    for (i = 0; i < 10; i++) {
                        System.out.print(array[i] + ", ");
                    }
                }
                case 2 -> {
                    for (i = 0; i < 10; i++) {
                        pos = i;
                        aux = array[i];

                        while ((pos > 0) && (array[pos - 1] > aux)) {
                            array[pos] = array[pos - 1];
                            pos--;
                        }
                        array[pos] = aux;
                    }
                    for (i = 0; i < 10; i++) {
                        System.out.print(array[i] + ", ");
                    }
                }
            }
        }
    }

}

