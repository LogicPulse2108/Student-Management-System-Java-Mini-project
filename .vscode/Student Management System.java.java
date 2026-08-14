 
import java.util.ArrayList; 
import java.util.Scanner; 
 
class Student { 
    int roll; 
    String name; 
    int age; 
 
    Student(int roll, String name, int age) { 
        this.roll = roll; 
        this.name = name; 
        this.age = age; 
    } 
 
    void display() { 
        System.out.println("Roll No: " + roll + ", Name: " + name + ", Age: " + age); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ArrayList<Student> list = new ArrayList<>(); 
 
        int choice; 
 
        do { 
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM ====="); 
            System.out.println("1. Add Student"); 
            System.out.println("2. View Students"); 
            System.out.println("3. Search Student"); 
            System.out.println("4. Update Student"); 
            System.out.println("5. Delete Student"); 
            System.out.println("6. Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
 
            switch (choice) { 
 
                case 1: 
                    System.out.print("Enter Roll No: "); 
                    int roll = sc.nextInt(); 
                    sc.nextLine(); 
 
                    System.out.print("Enter Name: "); 
                    String name = sc.nextLine(); 
 
                    System.out.print("Enter Age: "); 
                    int age = sc.nextInt(); 
 
                    list.add(new Student(roll, name, age)); 
                    System.out.println("Student Added Successfully!"); 
                    break; 
 
                case 2: 
                    System.out.println("Student List:"); 
                    for (Student s : list) { 
                        s.display(); 
                    } 
                    break; 
 
                case 3: 
                    System.out.print("Enter Roll No to Search: "); 
                    int searchRoll = sc.nextInt(); 
 
                    boolean found = false; 
                    for (Student s : list) { 
                        if (s.roll == searchRoll) { 
                            s.display(); 
                            found = true; 
                        } 
                    } 
                    if (!found) { 
                        System.out.println("Student Not Found!"); 
                    } 
                    break; 
 
                case 4: 
                    System.out.print("Enter Roll No to Update: "); 
                    int updateRoll = sc.nextInt(); 
 
                    for (Student s : list) { 
                        if (s.roll == updateRoll) { 
                            sc.nextLine(); 
                            System.out.print("Enter New Name: "); 
                            s.name = sc.nextLine(); 
 
                            System.out.print("Enter New Age: "); 
                            s.age = sc.nextInt(); 
 
                            System.out.println("Student Updated!"); 
                        } 
                    } 
                    break; 
 
                case 5: 
                    System.out.print("Enter Roll No to Delete: "); 
                    int deleteRoll = sc.nextInt(); 
 
                    list.removeIf(s -> s.roll == deleteRoll); 
                    System.out.println("Student Deleted!"); 
                    break; 
 
                case 6: 
                    System.out.println("Exiting Program..."); 
                    break; 
 
                default: 
                    System.out.println("Invalid Choice!"); 
            } 
 
        } while (choice != 6); 
    } 
} 