package com.company.Exercise1;

/**
 *
 * @version 1.01.001 2022-06-06.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

public class Planet {

    /**
     * Declaration of attributes.
     */
    public double mass;
    public double density;
    public double diametre;
    public double distanceToSun;
    public static double forceGravitattional = 6.67;
    public int id;
    public String name;
    public static double attraction;
    public static boolean program = true;

    public Planet(double mass, double density, double diametre, double distanceToSun, int id, String name) {
        this.mass = mass;
        this.density = density;
        this.diametre = diametre;
        this.distanceToSun = distanceToSun;
        this.id = id;
        this.name = name;
    }


    public double gravAttraction(double mass1, double mass2, double distanceToSun1, double distanceToSun2) {
        return attraction = (forceGravitattional*(mass1*mass2)) / (Math.pow((distanceToSun1-distanceToSun2),2));
    }

    public double getMass() {
        return mass;
    }


    public double getDistanceToSun() {
        return distanceToSun;
    }




    @Override
    public String toString(){
        return "Name: " + name + "  Mass: " + mass + "  Density: " + density + "  Diametre: " + diametre + " Distance to the sun " + distanceToSun + " ID: " + id + " \n";
    }

}
