package com.company.Exercise5;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Motorcycle extends Vehicle{

    /**
     * Adding new attribute to the sub-class
     */
    public double timeAccelerationTo100;

    /**
     * Builder to request the class.
     * @param id: identification of the object.
     * @param passengers: Maximum quantity of passengers.
     * @param wheels: Quantity of car's wheels.
     * @param enrollmentDate: Car's enrollment date.
     * @param wayDisplacement: Way of displacement.
     * @param crew: This class contains people?
     * @param timeAccelerationTo100: Time to get an acceleration of 100km/h
     */
    public Motorcycle(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew, double timeAccelerationTo100){
        super(id, passengers, wheels, enrollmentDate, wayDisplacement, crew);
        this.timeAccelerationTo100 = timeAccelerationTo100;
    }

    /**
     *
     * @return Print the created object.
     */
    @Override
    public String toString() {
        return  id +
                ". Vehicle: Motorcycle" +
                ". Maximum quantity of passengers: " + passengers +
                ". Crew: " + crew +
                ". Wheels: " + wheels +
                ". Enrollment Date: " + enrollmentDate +
                ". Way of displacement: " + wayDisplacement +
                ". Time in seconds to get a velocity of 100 KM/h:  " + timeAccelerationTo100 + "\n";
    }
}
