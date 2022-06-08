package com.company.Exercise5;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Boat extends Vehicle{

    public int maximumNauticalMile;

    /**
     * Builder to request the class.
     * @param id: identification of the object.
     * @param passengers: Maximum quantity of passengers.
     * @param wheels: Quantity of car's wheels.
     * @param enrollmentDate: Car's enrollment date.
     * @param wayDisplacement: Way of displacement.
     * @param crew: This class contains people?
     * @param maximumNauticalMile: Boat's maximum velocity nautical Mile.
     */
    public Boat(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew, int maximumNauticalMile){
        super(id, passengers, wheels, enrollmentDate, wayDisplacement, crew);
        this.maximumNauticalMile = maximumNauticalMile;
    }

    /**
     *
     * @return Print the created object.
     */
    @Override
    public String toString() {
        return  id +
                ". Vehicle: Boat" +
                ". Maximum quantity of passengers: " + passengers +
                ". Crew: " + crew +
                ". Wheels: " + wheels +
                ". Enrollment Date: " + enrollmentDate +
                ". Way of displacement: " + wayDisplacement +
                ". Maximum nautical mile (velocity):  " + maximumNauticalMile + "\n";
    }


}
