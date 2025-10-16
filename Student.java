public class Student {
    private String name;
    private String rollNo;
    private String course;

    public Student(String name, String rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{Name='" + name + "', RollNo='" + rollNo + "', Course='" + course + "'}";
    }
}
