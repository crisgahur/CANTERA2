package com.company;
/**
 * Class where are declared the attributes and methods of school.
 * @author Cristian Gallego Hurtado
 */

public class bankAccount {

    /**
     * Declaration of attributes.
     */
public int accountNumber;
public boolean activated = true;
private String name;
private int ammount;

    /**
     *
     * @return Allow get/show the attribute. Apply to all the getters.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public String getName() {
        return name;
    }

    public int getAmmount() {
        return ammount;
    }

    /**
     *The set allow designate a value to the private attributes
     **/

    public void setName(String name) {
        this.name = name;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
