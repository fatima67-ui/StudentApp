import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        // Issue: Poor variable names (s, m, a, b, c)
        ArrayList<String> s = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        
        // Issue: Unused variables
        String unusedVar = "This is a test";
        int temp = 100; 
        
        // Issue: Hardcoded values
        int hardcodedPassingMarks = 40; 

        Scanner sc = new Scanner(System.in);
        
        while (true) { // Issue: Infinite loop without proper exit condition (code smell)
            System.out.println("1. Add\n2. Average\n3. Highest\n4. Display\n5. Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Name: ");
                s.add(sc.next());
                System.out.print("Marks: ");
                m.add(sc.nextInt());
            } else if (ch == 2) {
                int sum = 0;
                for (int i = 0; i < m.size(); i++) {
                    sum += m.get(i);
                }
                // Issue: Bug (Division by zero if no students added)
                int avg = sum / m.size(); 
                System.out.println("Avg: " + avg);
            } else if (ch == 3) {
                // Issue: Duplicate Code & Hardcoded limit
                int high = 0; 
                for (int i = 0; i < m.size(); i++) {
                    if (m.get(i) > high) {
                        high = m.get(i);
                    }
                }
                System.out.println("Highest: " + high);
            } else if (ch == 4) {
                // Issue: Duplicate Code (same loop again)
                int high = 0;
                for (int i = 0; i < m.size(); i++) {
                    if (m.get(i) > high) {
                        high = m.get(i);
                    }
                }
                for (int i = 0; i < s.size(); i++) {
                    System.out.println(s.get(i) + " - " + m.get(i));
                }
            } else if (ch == 5) {
                // Issue: Using System.exit is a code smell in some standards
                System.exit(0); 
            }
        }
    }
}