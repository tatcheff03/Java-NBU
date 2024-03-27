package NBU_.NBU_exercise2603;

public class Main {
    public static void main(String[] args) {
        // Create a new Student
        Student student = new Student("Angel","F109309");

        // Create a new Program
        Program majorProgram = new Program(ProgramType.Major,"Computer Science");
        majorProgram.setReqCredits(15);

        // Create new Courses
        Course course1 = new Course("Java",6,CourseType.Required);
        Course course2 = new Course("Python",4,CourseType.Required);
        Course course3 = new Course("C++",5,CourseType.Required);

        // Add the Courses to the Program
        majorProgram.addCourse(course1);
        majorProgram.addCourse(course2);
        majorProgram.addCourse(course3);

        // Enroll the student in the Program
        student.addProgram(majorProgram);

        // Enroll the student in the Courses
        student.enrollInCourse(course1);
        student.enrollInCourse(course2);
        student.enrollInCourse(course3);

        // Complete the Courses
        student.completeCourse(course1);
        student.completeCourse(course2);
        student.completeCourse(course3);

        student.graduate();

        // Print the number of credits the student has got and needs to get
        System.out.println(student + " got " + student.getTotalCredits() + " number of credits");
        System.out.println("Student" + " has to get " + student.getCreditsToGraduate() + " number of credits");






    }
}