package NBU_.NBU_exercise2603;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private int reqCredits;
    private ProgramType type;
    private String name;
    private List<Course> courseList;


    public Program() {
        this.courseList = new ArrayList<>();

    }
    public Program(ProgramType type, String name) {
        this.type = type;
        this.name = name;
        this.courseList = new ArrayList<>();
    }

    public void setReqCredits(int reqCredits){
        this.reqCredits = reqCredits;
    }

    public boolean addCourse(Course course) {
        if (this.courseList.contains(course)) {
            return false;
        }
        return this.courseList.add(course);
    }

    public boolean removeCourse(Course course) {
        return this.courseList.remove(course);
    }

    public void showCoursesInProgram() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public int getRequiredCredits(){
        int totalCredits = 0;
        for (Course course : courseList) {
            totalCredits += course.getCredits();
        }
        return totalCredits;


    }
    public List<Course> getCourseList_() {
        return this.courseList;
    }
    public void showCoursesByType(CourseType courseType) {
        for (Course course : courseList) {
            if (course.gettype() == courseType) {
                System.out.println(course);
            }
        }
    }

    public ProgramType getType() {
        return type;
    }
    public void getCourseList(){
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
