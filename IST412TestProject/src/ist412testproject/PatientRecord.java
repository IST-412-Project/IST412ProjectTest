package ist412testproject;

public class PatientRecord 
{
    private Patient patient;

    public PatientRecord(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getRecord()
    {
        return patient.toString();
    }

    
}
