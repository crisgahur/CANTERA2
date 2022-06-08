package com.company.Exercise2;

import java.util.Scanner;

public class Example2 {
    public static int fila;
    public static int columna;
    public static int resultado;

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        for(fila = 1; fila <2; fila++)
        {
            for(columna=1; columna < 11; columna++)
            {
                System.out.print(columna +  "x" + fila + " ");
            }
            System.out.println(" ");
        }

        for(fila = 1; fila <9; fila++)
        {
            for(columna=1; columna < 11; columna++)
            {
                System.out.print(columna +  "x" + fila + " ");
            }
            System.out.println(" ");
        }

        for(fila = 10; fila <11; fila++)
        {
            for(columna=1; columna < 11; columna++)
            {
                System.out.print(columna +  "x" + fila + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Escriba la columna");
        columna = entrada.nextInt();

        System.out.println(" ");
        System.out.println("Escriba la fila");
        fila = entrada.nextInt();

        resultado = fila * columna;

        System.out.println(" ");

        if((fila <11) && (columna<11))
        {

            System.out.println("El resultado es " + resultado);
        }
        else
        {
            System.out.println("Los valores deben ser entre 1 y 10");

        }

    }
}
