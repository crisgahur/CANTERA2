package com.company.Exercise5;

/**
 *
 * @version 1.01.001 2022-06-07.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Bicycle extends Vehicle{
    /**
     * Declaration of attribute.
     */
    public String color;

    /**
     * Builder to request the class.
     * @param id: identification of the object.
     * @param passengers: Maximum quantity of passengers.
     * @param wheels: Quantity of car's wheels.
     * @param enrollmentDate: Car's enrollment date.
     * @param wayDisplacement: Way of displacement.
     * @param crew: This class contains people?
     * @param color: Bycicle's color.
     */
    public Bicycle(int id, int passengers, int wheels, String enrollmentDate, String wayDisplacement, String crew, String color){
        super(id, passengers, wheels, enrollmentDate, wayDisplacement, crew);
        this.color = color;
    }

    /**
     *
     * @return Print the created object.
     */
    @Override
    public String toString() {
        return  id +
                ". Vehicle: Bycicle" +
                ". Maximum quantity of passengers: " + passengers +
                ". Crew: " + crew +
                ". Wheels: " + wheels +
                ". Enrollment Date: " + enrollmentDate +
                ". Way of displacement: " + wayDisplacement +
                ". Color:  " + color + "\n";
    }
    }

