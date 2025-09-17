import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String userName = myObj.nextLine();
        
        System.out.println("Enter age:");
        int age = myObj.nextInt();
        
        System.out.println("Enter number:");
        long number = myObj.nextLong();
        myObj.nextLine();
        
        System.out.println("Enter address:");
        String address = myObj.nextLine();
        
        // User Details
        System.out.println("\n--- User Details ---");
        System.out.println("Username: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);

        myObj.close(); 
    }
}
