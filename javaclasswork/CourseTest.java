
public class Course {
    private String courseName;
    private int durationWeeks;
    public static int courseCount = 0; /
    public final String TRAINING_CENTER = "TechSkills Training Center"; 
    public Course() {
        this.courseName = "Default Course";
        this.durationWeeks = 4; 
        courseCount++; 
   
    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + durationWeeks);
        System.out.println("Training Center: " + TRAINING_CENTER);
    }
    public class CourseMaterial {
        public void printMaterialInfo() {
            System.out.println("Materials provided for this course.");
        }
    }
}

public class CourseTest {
    public static void main(String[] args) {
        r
        Course course1 = new Course();
        System.out.println("Course 1 Details:");
        course1.printCourseDetails();
        Course.CourseMaterial material1 = course1.new CourseMaterial();
        material1.printMaterialInfo();

        System.out.println();

        
        Course course2 = new Course("Advanced Java", 8);
        System.out.println("Course 2 Details:");
        course2.printCourseDetails();
        Course.CourseMaterial material2 = course2.new CourseMaterial();
        material2.printMaterialInfo();

        System.out.println();

        
        System.out.println("Total Courses Created: " + Course.courseCount);
    }
}

