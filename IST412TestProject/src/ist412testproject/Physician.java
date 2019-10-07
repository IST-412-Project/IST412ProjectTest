/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412testproject;

public class Physician 
{
    private long physicianID;
    private String firstName;
    private String lastName;

    public Physician(long physicianID, String firstName, String lastName) {
        this.physicianID = physicianID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getPhysicianID() {
        return physicianID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
}
