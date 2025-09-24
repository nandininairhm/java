
public class Course {
    private String courseName;
    private int durationWeeks;
    private int studentsEnrolled;
    public static final String CREATOR = "CodeMentor Academy";
    private static int totalStudents = 0;
    public Course(String courseName, int durationWeeks, int studentsEnrolled) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.studentsEnrolled = studentsEnrolled;
        totalStudents += studentsEnrolled;
    }
    public String getCourseName() {
        return courseName;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
    public static class Platform {
        public static void printPlatformMessage() {
            System.out.println("Courses are hosted on CodeMentor.");
        }
    }
}
public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 8, 30);
        Course course2 = new Course("Web Development", 6, 25);
        System.out.println("Course 1:");
        System.out.println("Name: " + course1.getCourseName());
        System.out.println("Duration (weeks): " + course1.getDurationWeeks());
        System.out.println("Students Enrolled: " + course1.getStudentsEnrolled());
        System.out.println("Creator: " + Course.CREATOR);

        System.out.println();

        System.out.println("Course 2:");
        System.out.println("Name: " + course2.getCourseName());
        System.out.println("Duration (weeks): " + course2.getDurationWeeks());
        System.out.println("Students Enrolled: " + course2.getStudentsEnrolled());
        System.out.println("Creator: " + Course.CREATOR);

        System.out.println();

        System.out.println("Total Students Enrolled Across All Courses: " + Course.getTotalStudents());

        System.out.println();
        Course.Platform.printPlatformMessage();
    }
}

