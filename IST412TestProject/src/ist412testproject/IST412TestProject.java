package ist412testproject;

public class IST412TestProject 
{

    public static void main(String[] args) 
    {
        ScheduleCntl scheduleCtnl = new ScheduleCntl();
        RecordCntl recordCntl = new RecordCntl();
        ManageCntl manageCntl = new ManageCntl();
        EmergencyCntl emergencyCntl = new EmergencyCntl();
        
        Patient patient = new Patient(12345, "Bob", "Howard", 20, "9/12/1997");
        PatientRecord patientRecord = new PatientRecord(patient);
        Physician physician = new Physician(12345, "Me", "Memington");      
        Surgeon surgeon = new Surgeon(12345, "Mike", "TV");
        PhysicianAssistant physicianAssistant = new PhysicianAssistant(12345, "John", "Travolta");
        
        scheduleCtnl.PhysicianAvailibility(physician);
        scheduleCtnl.getLoggedUsersSchedule(patient, physician);
        recordCntl.getRecord(patientRecord);
        manageCntl.createRecord(physician, surgeon, physicianAssistant);
        manageCntl.addRecord(patientRecord);
        emergencyCntl.createRecord();
        emergencyCntl.addRecord();   
    }
    
}
