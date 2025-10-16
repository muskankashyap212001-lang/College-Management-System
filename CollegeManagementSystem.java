import java.util.*;

public class CollegeManagementSystem {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("===== College Management System =====");
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Add Teacher\n3. Add Course\n4. View All\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addTeacher();
                case 3 -> addCourse();
                case 4 -> viewAll();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        students.add(new Student(name, rollNo, course));
        System.out.println("Student added successfully!");
    }

    private static void addTeacher() {
        System.out.print("Enter Teacher Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        teachers.add(new Teacher(name, subject));
        System.out.println("Teacher added successfully!");
    }

    private static void addCourse() {
        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Duration (in years): ");
        int duration = sc.nextInt();
        courses.add(new Course(name, duration));
        System.out.println("Course added successfully!");
    }

    private static void viewAll() {
        System.out.println("\n--- Students ---");
        for (Student s : students) System.out.println(s);
        System.out.println("\n--- Teachers ---");
        for (Teacher t : teachers) System.out.println(t);
        System.out.println("\n--- Courses ---");
        for (Course c : courses) System.out.println(c);
    }
}
