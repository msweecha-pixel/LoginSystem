import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    students.add(new Student(id, name));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    for(Student s : students) {
                        System.out.println(s.id + " " + s.name);
                    }
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
} 
    
