package com.company;

/**
 * Class where are declared the attributes and methods of television.
 * @author Cristian Gallego Hurtado
 */

public class Television {
    /**
     * Declaration of attributes.
     */
    public float model;
    private double price;
    protected boolean connection = true;
    private float weight;
    private float volume;


    /**
     *The set allow designate a value to the private attributes
     **/
    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public float getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isConnection() {
        return connection;
    }

    public float getWeight() {
        return weight;
    }

    public float getVolume() {
        return volume;
    }
}
