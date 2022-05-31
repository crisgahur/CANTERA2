package com.company;

/**
 * Class where are declared the attributes and methods of school.
 * @author Cristian Gallego Hurtado
 */

public class Airplane {

    /**
     * Declaration of attributes.
     */
    public String model;
    private float capacity;
    protected boolean cyberSecurity = true;
    private double gasolineTanks;


    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public String getModel() {
        return model;
    }

    public float getCapacity() {
        return capacity;
    }

    public double getGasolineTanks() {
        return gasolineTanks;
    }
    public boolean isCyberSecurity() {
        return cyberSecurity;
    }


    /**
     *The set allow designate a value to the private attributes
     **/
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setGasolineTanks(double gasolineTanks) {
        this.gasolineTanks = gasolineTanks;
    }
}
