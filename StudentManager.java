import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(); // Poor variable name 's'
        ArrayList<Integer> m = new ArrayList<>(); // Poor variable name 'm'
        
        Scanner sc = new Scanner(System.in);
        int x = 1; // Hardcoded value / unused variable
        String unusedVar = "This is not used"; // Unused variable

        while (x == 1) { // Hardcoded value
            System.out.println("1. Add\n2. Average\n3. Highest\n4. Display\n5. Search");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Enter Name: ");
                String name = sc.next();
                s.add(name);
                System.out.println("Enter Marks: ");
                m.add(sc.nextInt());
            } else if (choice == 2) {
                // Missing exception handling (divide by zero if no students)
                int total = 0;
                for (int i = 0; i < m.size(); i++) {
                    total = total + m.get(i);
                }
                int avg = total / m.size(); // Division by zero possible
                System.out.println("Average: " + avg);
            } else if (choice == 3) {
                // Very long method / Duplicate code
                int highest = 0; // hardcoded
                for (int i = 0; i < m.size(); i++) {
                    if (m.get(i) > highest) {
                        highest = m.get(i);
                    }
                }
                System.out.println("Highest: " + highest);
            } else if (choice == 4) {
                // Duplicate code (similar loop like above)
                int highest = 0;
                for (int i = 0; i < m.size(); i++) {
                    if (m.get(i) > highest) {
                        highest = m.get(i);
                    }
                }
                for (int i = 0; i < s.size(); i++) {
                    System.out.println("Name: " + s.get(i) + " | Marks: " + m.get(i) + " | Highest is " + highest);
                }
            } else if (choice == 5) {
                System.out.println("Enter name to search: ");
                String searchName = sc.next();
                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i).equals(searchName)) {
                        System.out.println("Found: " + s.get(i));
                    }
                }
                else if (choice == 5) {
                System.out.println("Enter name to search: ");
                String searchName = sc.next();
                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i).equals(searchName)) {
                        System.out.println("Found: " + s.get(i));
                    }
                }

                else if (choice == 5) {
                System.out.println("Enter name to search: ");
                String searchName = sc.next();
                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i).equals(searchName)) {
                        System.out.println("Found: " + s.get(i));
                    }
                }
            }
        }
    }
}