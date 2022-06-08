package com.company.Exercise4;

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

    public static void main(String[] args) {

        ArrayList<Vehicle> myVehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);

        System.out.println("1. Write the passengers");
        int passengers1 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels1 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate1 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement1 = st.nextLine();
        System.out.println("Contains crew?");
        String crew1 = st.nextLine();
        myVehicles.add(new Vehicle(1, passengers1, wheels1, enrollmentDate1, wayDisplacement1, crew1)) ;


        System.out.println("\n2. Write the passengers");
        int passengers2 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels2 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate2 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement2 = st.nextLine();
        System.out.println("Contains crew?");
        String crew2 = st.nextLine();
        myVehicles.add(new Vehicle(2, passengers2, wheels2, enrollmentDate2, wayDisplacement2, crew2));

        System.out.println("\n3. Write the passengers");
        int passengers3 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels3 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate3 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement3 = st.nextLine();
        System.out.println("Contains crew?");
        String crew3 = st.nextLine();
        myVehicles.add(new Vehicle(3, passengers3, wheels3, enrollmentDate3, wayDisplacement3, crew3));

        System.out.println("\n4. Write the passengers");
        int passengers4 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels4 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate4 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement4 = st.nextLine();
        System.out.println("Contains crew?");
        String crew4 = st.nextLine();
        myVehicles.add(new Vehicle(4, passengers4, wheels4, enrollmentDate4, wayDisplacement4, crew4));

        System.out.println("\n5. Write the passengers");
        int passengers5 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels5 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate5 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement5 = st.nextLine();
        System.out.println("Contains crew?");
        String crew5 = st.nextLine();
        myVehicles.add(new Vehicle(5, passengers5, wheels5, enrollmentDate5, wayDisplacement5, crew5));

        System.out.println("\n6. Write the passengers");
        int passengers6 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels6 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate6 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement6 = st.nextLine();
        System.out.println("Contains crew?");
        String crew6 = st.nextLine();
        myVehicles.add(new Vehicle(6, passengers6, wheels6, enrollmentDate6, wayDisplacement6, crew6));

        System.out.println("\n7. Write the passengers");
        int passengers7 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels7 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate7 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement7 = st.nextLine();
        System.out.println("Contains crew?");
        String crew7 = st.nextLine();
        myVehicles.add(new Vehicle(7, passengers7, wheels7, enrollmentDate7, wayDisplacement7, crew7));

        System.out.println("\n8. Write the passengers");
        int passengers8 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels8 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate8 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement8 = st.nextLine();
        System.out.println("Contains crew?");
        String crew8 = st.nextLine();
        myVehicles.add(new Vehicle(8, passengers8, wheels8, enrollmentDate8, wayDisplacement8, crew8));

        System.out.println("\n9. Write the passengers");
        int passengers9 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels9 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate9 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement9 = st.nextLine();
        System.out.println("Contains crew?");
        String crew9 = st.nextLine();
        myVehicles.add(new Vehicle(9, passengers9, wheels9, enrollmentDate9, wayDisplacement9, crew9));

        System.out.println("\n10. Write the passengers");
        int passengers10 = sc.nextInt();
        System.out.println("Write the wheels");
        int wheels10 = sc.nextInt();
        System.out.println("Write the date of enrollment");
        String enrollmentDate10 = st.nextLine();
        System.out.println("Write the way of displacement");
        String wayDisplacement10 = st.nextLine();
        System.out.println("Contains crew?");
        String crew10 = st.nextLine();
        myVehicles.add(new Vehicle(10, passengers10, wheels10, enrollmentDate10, wayDisplacement10, crew10));

        System.out.println(myVehicles);

    }
}
