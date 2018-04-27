package polymorphDataStudent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentList implements InputInfo, AverageAge {
    Student students[] = new Student[3];
    @Override
    public void inputInfo() throws ParseException {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the student's name:");
            String name = in.nextLine();
            System.out.println("Enter the student's lastName:");
            String lastName = in.nextLine();
            System.out.println("Enter the student's date of birth:");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            String strDate = in.nextLine();
            Date dateOfBirth = simpleDateFormat.parse(strDate);
            students[i] = new Student(name, lastName, dateOfBirth);
        }
    }
    @Override
    public void printAverageAge() {
        Date now = new Date();
        long sumAge = 0;
        long currentAge = 0;
        for (int i = 0; i < students.length; i++) {
            sumAge += students[i].getDate().getTime();
        }
        long averageAge = sumAge / students.length;
        currentAge = now.getTime() - averageAge;
        int temp = (int) (currentAge / 1000 / 60);
        int minutes = temp % 60;
        temp = temp / 60;
        int hours = temp % 24;
        temp = temp / 24;
        int days = temp % 30;
        temp = temp / 30;
        int months = temp % 12;
        int years = temp / 12;
        System.out.printf("The average age is %d years, %d months, %d days, %d hours, %d minutes.\n", years, months, days, hours, minutes);
    }
}
