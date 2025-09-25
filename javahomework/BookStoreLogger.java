
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BookStoreLogger {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String time = "10:30 AM"; 
        String message = "Book order placed at " + time;
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(message);
            writer.close();
            System.out.println(" Log file created and message written successfully.");
        } catch (IOException e) {
            System.out.println(" Failed to write to log file: " + e.getMessage());
            return;
        }
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.print(" Reading log message: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println(" Log file read successfully.");
        } catch (IOException e) {
            System.out.println(" Failed to read the log file: " + e.getMessage());
            return;
        }
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(" Log file deleted successfully.");
        } else {
            System.out.println(" Failed to delete the log file.");
        }
    }
}
