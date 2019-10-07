package ist412testproject;

public class PhysicianAssistant 
{
    private long physicianAssistantID;
    private String firstName;
    private String lastName;

    public PhysicianAssistant(long physicianAssistantID, String firstName, String lastName) {
        this.physicianAssistantID = physicianAssistantID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getPhysicianAssistantID() {
        return physicianAssistantID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
}
