package com.company.Exercise4;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */
public class Vehicle {
    public String crew;
    public int wheels, id, passengers;
    public String enrollmentDate;
    public String wayDisplacement;


    public Vehicle(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew) {
        this.id = id;
        this.passengers = passengers;
        this.wheels = wheels;
        this.enrollmentDate = enrollmentDate;
        this.wayDisplacement = wayDisplacement;
        this.crew = crew;
    }

    @Override
    public String toString() {
        return  id +
                ". Vehicle:" +
                " Passengers: " + passengers +
                " Crew: " + crew +
                " Wheels: " + wheels +
                " Enrollment Date: " + enrollmentDate +
                " Way of displacement: " + wayDisplacement + '\n';
    }


}
