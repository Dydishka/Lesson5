package polymorphDataStudent;

import java.util.Date;

public class Student implements GetDate {
    private String name;
    private String lastName;
    private Date dateOfBirth;

    public Student(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public Date getDate() {
        return dateOfBirth;
    }
}
