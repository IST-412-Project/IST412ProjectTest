package ist412testproject;

public class Patient 
{
    private long PatientID;
    private String firstName;
    private String lastName;
    private Integer age;
    private String birthDate;

    public Patient(long PatientID, String firstName, String lastName, Integer age, String birthDate) {
        this.PatientID = PatientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    public long getPatientID() {
        return PatientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Patient{" + "PatientID=" + PatientID + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", birthDate=" + birthDate + '}';
    }
    
    

}
