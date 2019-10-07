/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
