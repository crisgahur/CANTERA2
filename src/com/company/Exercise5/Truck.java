package com.company.Exercise5;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Truck extends Vehicle{
    /**
     * Declaration of attribute.
     */

    public double height;

    /**
     * Builder to request the class.
     * @param id: identification of the object.
     * @param passengers: Maximum quantity of passengers.
     * @param wheels: Quantity of car's wheels.
     * @param enrollmentDate: Car's enrollment date.
     * @param wayDisplacement: Way of displacement.
     * @param crew: This class contains people?
     * @param height: Truck's height.
     */
    public Truck(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew, double height){
        super(id, passengers, wheels, enrollmentDate, wayDisplacement, crew);
        this.height = height;
    }

    /**
     *
     * @return Print the created object.
     */
    @Override
    public String toString() {
        return  id +
                ". Vehicle: Truck" +
                ". Maximum quantity of passengers: " + passengers +
                ". Crew: " + crew +
                ". Wheels: " + wheels +
                ". Enrollment Date: " + enrollmentDate +
                ". Way of displacement: " + wayDisplacement +
                ". Height:  " + height + "\n";
    }
}
