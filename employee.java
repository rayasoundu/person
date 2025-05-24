
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person {

    private String name;
    private Date dob;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = sdf.parse(dob);
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + sdf.format(dob));
    }
}

public class employee extends Person {

    private int empId;
    private double salary;

    public employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}
