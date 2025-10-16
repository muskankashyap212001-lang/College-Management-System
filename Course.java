public class Course {
    private String name;
    private int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{Name='" + name + "', Duration=" + duration + " years}";
    }
}
