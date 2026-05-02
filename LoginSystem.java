import java.io.*;
import java.util.*;

public class LoginSystem {

    public static void register(String username, String password) {
        try {
            FileWriter fw = new FileWriter("users.txt", true);
            fw.write(username + "," + password + "\n");
            fw.close();
            System.out.println("Registration Successful!");
        } catch(IOException e) {
            System.out.println("Error");
        }
    }

    public static boolean login(String username, String password) {
        try {
            File file = new File("users.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] user = data.split(",");

                if(user[0].equals(username) && user[1].equals(password)) {
                    return true;
                }
            }
            sc.close();
        } catch(Exception e) {
            System.out.println("Error");
        }
        return false;
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1. Register");
    System.out.println("2. Login");
    System.out.print("Enter choice: ");

    int choice = sc.nextInt();
    sc.nextLine(); // important

    System.out.print("Enter Username: ");
    String username = sc.nextLine();

    System.out.print("Enter Password: ");
    String password = sc.nextLine();

    if(choice == 1) {
        register(username, password);
    } 
    else if(choice == 2) {
        if(login(username, password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials!");
        }
    } else {
        System.out.println("Invalid Choice!");
    }
}
}