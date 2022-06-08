package com.company.Exercise5;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */
public class Vehicle {
    /**
     * Declaration of attributes.
     */
    public String crew;
    protected int wheels, id, passengers;
    public String enrollmentDate;
    public String wayDisplacement;


    /**
     * Builder to request the class.
     * @param id: identification of the vehicle.
     * @param passengers: Maximum quantity of passengers.
     * @param wheels: Quantity of vehicle's wheels.
     * @param enrollmentDate: Car's enrollment date.
     * @param wayDisplacement: Way of displacement.
     * @param crew: This vehicle contains people?
     */
    public Vehicle(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew) {
        this.id = id;
        this.passengers = passengers;
        this.wheels = wheels;
        this.enrollmentDate = enrollmentDate;
        this.wayDisplacement = wayDisplacement;
        this.crew = crew;
    }

    /**
     *
     * @return Print the created object.
     */
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
