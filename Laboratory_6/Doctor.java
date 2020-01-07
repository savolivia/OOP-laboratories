package Laboratory_6;

import java.time.LocalDate;
import java.util.Date;

public class Doctor extends OperationsStaff {
    public  String[] speciality;
    public String[] locations;

    public Doctor(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone, Date joined, String[] education, String[] certification, String[] languages, String[] speciality, String[] locations) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone, joined, education, certification, languages);
        this.speciality = speciality;
        this.locations = locations;
    }
}

