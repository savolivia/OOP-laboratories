package Laboratory_6;

import java.time.LocalDate;
import java.time.Period;


public class Patient extends Person {
    String id;
    Hospital[] hospitals;
    OperationsStaff[] operationsStaff;
    public String[] sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    public Patient(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone, String id, Hospital[] hospitals, OperationsStaff[] operationsStaff, String[] sickness, String[] prescriptions, String[] allergies, String[] specialReqs) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone);
        this.id = id;
        this.hospitals = hospitals;
        this.operationsStaff = operationsStaff;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public int getAge() {
        Period age = Period.between(birthDate, LocalDate.now());
        return age.getYears();
    }
}
