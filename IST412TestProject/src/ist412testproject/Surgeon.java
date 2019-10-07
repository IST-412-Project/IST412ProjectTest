/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412testproject;

public class Surgeon 
{
    private long SurgeonID;
    private String firstName;
    private String lastName;

    public Surgeon(long SurgeonID, String firstName, String lastName) {
        this.SurgeonID = SurgeonID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getSurgeonID() {
        return SurgeonID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
}
