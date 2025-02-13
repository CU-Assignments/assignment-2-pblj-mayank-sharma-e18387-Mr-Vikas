abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter Student Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Teacher Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Teacher Subject: ");
        String subject = scanner.nextLine();
        
        Student student = new Student(studentName, studentAge, rollNumber);
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
        scanner.close();
    }
}
