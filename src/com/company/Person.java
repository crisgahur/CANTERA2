package com.company;

/**
 * Class where are declared the attributes and methods of school.
 * @author Cristian Gallego Hurtado
 */

import java.util.Date;

public class Person {

    /**
     * Declaration of attributes.
     */
    public String name;
    private String lastName1;
    private String lastName2;
    private Date dateBirth;
    private float height;
    private float weight;


    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public String getName() {
        return name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    /**
     *The set allow designate a value to the private attributes
     **/
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}



