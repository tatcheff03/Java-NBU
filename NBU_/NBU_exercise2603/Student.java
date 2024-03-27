package NBU_.NBU_exercise2603;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String facNum;
    private boolean isGraduated;
    private List<Program> programList;
    private List<Course> courseList;
    private List<Course> graduatedCourses;

    public Student() {
        this.programList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.graduatedCourses = new ArrayList<>();
    }

    public List<Course>getCourseList(){
        return this.courseList;
    }

    public Student(String name, String facNum) {
        this.name = name;
        this.facNum = facNum;
        this.programList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.graduatedCourses = new ArrayList<>();
    }


    public boolean hasCompletedAllCourses() {
        return this.courseList.isEmpty();
    }

    public boolean enrollInCourse(Course course) {
        for (Program program : programList) {
            if (program.getCourseList_().contains(course)) {
                return this.courseList.add(course);
            }
        }
        return false;
    }

    public boolean uneEnrollFromCourse(Course course) {
        return this.courseList.remove(course);
    }

    public boolean completeCourse(Course course) {
        if (this.courseList.remove(course)) {
            return this.graduatedCourses.add(course);
        }
        return false;
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (Course course : graduatedCourses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }

    public int getCreditsToGraduate() {
        for (Program program : programList) {
            if (program.getType() == ProgramType.Major) {
                return program.getRequiredCredits() - getTotalCredits();
            }
        }
        return -1;
    }

    public boolean graduate() {
        int requiredCredits = 0;
        for (Program program : programList) {
            if (program.getType() == ProgramType.Major) {
                requiredCredits = program.getRequiredCredits();
                break;
            }
        }

        if (getTotalCredits() >= requiredCredits) {
        this.isGraduated = true;
    }
    return this.isGraduated;
}


    public boolean isProgramTypeEnrolled(ProgramType programType) {
        for (Program program : programList) {
            if (program.getType() == programType) {
                return true;
            }
        }
        return false;
    }

    public boolean addProgram(Program program) {
        if (!isProgramTypeEnrolled((program.getType()))) {
            return this.programList.add(program);
        }
        return false;
    }

    public boolean removeProgram(Program program) {
        return this.programList.remove(program);
    }

    public String getName() {
        return name;
    }

    public List<Course> getGraduatedCourses() {
        return graduatedCourses;
    }
public List<Course>printprogramlist(){
        for (Program program : programList) {
            program.showCoursesInProgram();
        }
        return null;
}
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", facNum='" + facNum + '\'' +
                ", isGraduated=" + isGraduated +
                ", programList=" + programList +
                ", courseList=" + courseList +
                ", graduatedCourses=" + graduatedCourses +
                '}';
}
}



