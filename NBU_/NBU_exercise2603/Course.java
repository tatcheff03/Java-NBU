package NBU_.NBU_exercise2603;

public class Course {

    private String name;
    private int credits;
    private CourseType type;

    private final int id;
    private static int countCourses = 0;


    public Course(String name, int credits, CourseType type) {
        countCourses++;
        this.id = ++countCourses;
        this.name = name;
        this.credits = credits;
        this.type = type;
    }
    public  CourseType gettype(){
        return type;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", type=" + type +
                ", id=" + id +
                '}';
    }
}
