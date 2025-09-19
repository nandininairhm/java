import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class att {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.println("Enter marks of " + names[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println("Student Details ");

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
            if (marks[i] < 35) {
                System.out.printl(" Needs Improvement");
            }
        }

        
        double average = calculateAverage(marks);
        System.out.println("\nAverage Marks: " + average);

        
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Program ended on: " + currentDateTime.format(formatter));

        scanner.close();
    }

    
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
