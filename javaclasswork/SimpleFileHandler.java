import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileHandler {
    public static void main(String[] args) {
        String fileName = "assignment.txt";
        String content = "Java File Handling Practice";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println(" File created and content written successfully.");
        } catch (IOException e) {
            System.out.println(" Error writing to the file: " + e.getMessage());
            return;
        }

        try {
            FileReader reader = new FileReader(fileName);
            System.out.println(" Reading from file:");
            int ch;
            while ((ch = reader.read())= -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println(" File read successfully.");
        } catch (IOException e) {
            System.out.println(" Error reading the file: " + e.getMessage());
            return;
        }
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(" File deleted successfully.");
        } else {
            System.out.println(" Failed to delete the file.");
        }
    }
}
