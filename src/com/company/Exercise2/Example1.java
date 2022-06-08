package com.company.Exercise2;

public class Example1 {

    public static int fila = 0;
    public static int columna = 0;

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        matriz[0][0] = Integer.parseInt("01");
        matriz[0][1] = Integer.parseInt("02");
        matriz[0][2] = Integer.parseInt("03");
        matriz[0][3] = Integer.parseInt("04");
        matriz[0][4] = Integer.parseInt("05");

        matriz[1][0] = Integer.parseInt("06");
        matriz[1][1] = Integer.parseInt("07");
        matriz[1][2] = Integer.parseInt("08");
        matriz[1][3] = Integer.parseInt("09");
        matriz[1][4] = Integer.parseInt("10");

        matriz[2][0] = Integer.parseInt("11");
        matriz[2][1] = Integer.parseInt("12");
        matriz[2][2] = Integer.parseInt("13");
        matriz[2][3] = Integer.parseInt("14");
        matriz[2][4] = Integer.parseInt("15");

        matriz[3][0] = Integer.parseInt("16");
        matriz[3][1] = Integer.parseInt("17");
        matriz[3][2] = Integer.parseInt("18");
        matriz[3][3] = Integer.parseInt("19");
        matriz[3][4] = Integer.parseInt("20");

        while((fila <=3) && (columna<=4))
        {
            for (fila = 0; fila <4; fila++)
            {
                for(columna = 0; columna < 5; columna++)
                {
                    System.out.print(matriz[fila][columna] +  " ");
                }

                System.out.println(" ");
            }
            fila = fila + 1;
        }
        System.out.println(" ");
        System.out.println("Ahora se imprimiran en diferente orden: ");
        System.out.println(" ");

        fila = 0;
        columna = 0;

        while((fila<4) && (columna<5))
        {
            for(fila = 0; fila <1; fila++)
            {
                for (columna = 0; columna < 5; columna++)
                {
                    System.out.print(matriz[fila][columna] +  " ");
                }
                System.out.println(" ");
            }

            for(fila = 1; fila <2; fila++)
            {
                for (columna = 0; columna <5; columna++)
                {
                    System.out.print(matriz[fila][4 - columna] +  " ");
                }
                System.out.println(" ");
            }

            for(fila = 2; fila <3; fila++)
            {
                for (columna = 0; columna <5; columna++)
                {
                    System.out.print(matriz[fila][columna] +  " ");
                }
                System.out.println(" ");
            }

            for(fila = 3; fila <4; fila++)
            {
                for (columna = 0; columna <5; columna++)
                {
                    System.out.print(matriz[fila][4 - columna] +  " ");
                }
                System.out.println(" ");
            }

            fila = fila +1;

        }

    }
}
