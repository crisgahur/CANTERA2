package com.company;

/**
 * Class where are declared the attributes and methods of school.
 * @author Cristian Gallego Hurtado
 */

public class School {

    /**
     * Declaration of attributes.
     */
    public String name;
    private double classrooms;
    private double students;
    public double teachers;
    protected boolean authorization = true;

    /**
     *The set allow designate a value to the private attributes
     **/
    public void setClassrooms(double classrooms) {
        this.classrooms = classrooms;
    }

    public void setStudents(double students) {
        this.students = students;
    }

    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public String getName() {
        return name;
    }

    public double getClassrooms() {
        return classrooms;
    }

    public double getStudents() {
        return students;
    }

    public double getTeachers() {
        return teachers;
    }

    public boolean isAuthorization() {
        return authorization;
    }
}
