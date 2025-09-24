public class Course {
    String courseName;
    int durationWeeks;
     static int courseCount = 0;

    final String trainingCenterName = "Tech Training Center";
public Course() {
        courseName = "Default Course";
        durationWeeks = 4;
        courseCount++;
    }
    public Course(String name, int weeks) {
        courseName = name;
        durationWeeks = weeks;
        courseCount++;
    }
    public class CourseMaterial {
        public void printMaterialInfo() {
            System.out.println("Materials provided for this course.");
        }
    }
    public static void main(String[] args) {
        Course course1 = new Course();
        Course.CourseMaterial material1 = course1.new CourseMaterial();
        Course course2 = new Course("Java Programming", 8);
        Course.CourseMaterial material2 = course2.new CourseMaterial();
        System.out.println("Course 1:");
        System.out.println("Name: " + course1.courseName);
        System.out.println("Duration: " + course1.durationWeeks + " weeks");
        System.out.println("Training Center: " + course1.trainingCenterName);
        material1.printMaterialInfo();

        System.out.println();

        System.out.println("Course 2:");
        System.out.println("Name: " + course2.courseName);
        System.out.println("Duration: " + course2.durationWeeks + " weeks");
        System.out.println("Training Center: " + course2.trainingCenterName);
        material2.printMaterialInfo();

        System.out.println();

        System.out.println("Total Courses Created: " + Course.courseCount);
    }
}
