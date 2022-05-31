package com.company;

/**
 *  It's a class to create one of the several kinds of spacecrafts.
 * @author Cristian Gallego Hurtado
 */


public class Cargo extends Spacecraft{


    /**
     * Abstract classes.
     * @return return the values than the user will assign to the attributes.
     */
    @Override
    public String getName() {
        System.out.println("Write the name of the spacecraft");
        name = entry.nextLine();
        return name;
    }

    @Override
    public String getObjective() {
        System.out.println("Write the objective of the spacecraft");
        objective = entry.nextLine();
        return objective;
    }

    @Override
    public int getPower() {
        System.out.println("Write the power/potency of the spacecraft");
        power = entry2.nextInt();
        return power;
    }

    @Override
    public int getWeight() {
        System.out.println("Write the weight of the spacecraft");
        weight = entry2.nextInt();
        return weight;
    }

    @Override
    public String getFuelType() {
        System.out.println("Write the fuel type of the spacecraft");
        fuelType = entry.nextLine();
        return fuelType;
    }

    @Override
    public int getCapacity() {
        System.out.println("Write the capacity of the spacecraft");
        capacity = entry2.nextInt();
        return capacity;
    }


}
