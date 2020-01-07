package Laboratory_6;

import java.time.LocalDate;

enum Gender {
    male,
    female
}

public  class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public LocalDate birthDate;
    public  Gender gender;
    public Phone phone;

    public Person(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
    };

    public String getFullName() {
        return title + givenName  + middleName  + familyName;
    }
}