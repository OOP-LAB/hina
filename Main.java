import java.util.Scanner; 
class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    protected String empid;
    protected String company;
    protected String qualification;
    protected double salary;

    public Employee(String name, String gender, String address, int age, String empid, String company,
                    String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company = company;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    protected String subject;
    protected String department;
    protected String teachingLang;

    public Teacher(String name, String gender, String address, int age, String empid, String company,
                   String qualification, double salary, String subject, String department, String teachingLang) {
        super(name, gender, address, age, empid, company, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teachingLang = teachingLang;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company: " + company);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teaching Language: " + teachingLang);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Employee ID: ");
            String empid = scanner.nextLine();
            System.out.print("Company: ");
            String company = scanner.nextLine();
            System.out.print("Qualification: ");
            String qualification = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Teaching Language: ");
            String teachingLang = scanner.nextLine();

            teachers[i] = new Teacher(name, gender, address, age, empid, company, qualification, salary,
                    subject, department, teachingLang);
            }
                    
             System.out.println("\n*****Information of all teachers******");
  for( int i=0;i<N;i++){
     int j=i+1;
     System.out.println("\n"+j+").");
     teachers[i].displayDetails();
  }
            System.out.println();
        }
}

       

