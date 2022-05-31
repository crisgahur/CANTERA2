package com.company;

import java.util.ArrayList;

/**
 * Class where are declared the attributes and methods of fruit.
 * @author Cristian Gallego Hurtado
 */

public class Fruit {

    /**
     * Declaration of attributes.
     */
    private String name;
    private float averageWeight;
    public float price;
    private ArrayList<String> colors;
    private ArrayList<String> flavors;


    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public ArrayList<String> getFlavors() {
        return flavors;
    }

    public String getName() {
        return name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public float getPrice() {
        return price;
    }

    /**
     *The set allow designate a value to the private attributes
     **/
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public void setFlavors(ArrayList<String> flavors) {
        this.flavors = flavors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }


}
