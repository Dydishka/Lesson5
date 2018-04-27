package polymorphDataStudent;

import java.text.ParseException;

public class Main2 {
    public static void main(String[] args) throws ParseException {
        StudentList student = new StudentList();
        student.inputInfo();
        student.printAverageAge();
    }
}