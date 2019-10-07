package ist412testproject;

public class TestHarness 
{
    public void test()
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
        System.out.println("scheduleCtnl.PhysicianAvailibility(physician) - Successful");
        scheduleCtnl.getLoggedUsersSchedule(patient, physician);
        System.out.println("scheduleCtnl.getLoggedUsersSchedule(patient, physician); - Successful");
        recordCntl.getRecord(patientRecord);
        System.out.println("recordCntl.getRecord(patientRecord); - Successful");
        manageCntl.createRecord(physician, surgeon, physicianAssistant);
        System.out.println("manageCntl.createRecord(physician, surgeon, physicianAssistant); - Successful");
        manageCntl.addRecord(patientRecord);
        System.out.println("manageCntl.addRecord(patientRecord); - Successful");
        emergencyCntl.createRecord();
        System.out.println("emergencyCntl.createRecord(); - Successful");
        emergencyCntl.addRecord();   
        System.out.println("emergencyCntl.addRecord(); - Successful");
    }
}
