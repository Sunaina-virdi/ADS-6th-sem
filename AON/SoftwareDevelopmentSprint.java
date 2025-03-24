package Aon;
import java.util.Scanner;

public class SoftwareDevelopmentSprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int N = sc.nextInt();  // Total tasks
        int n1 = sc.nextInt(); // Developers for Feature Development
        int n2 = sc.nextInt(); // Developers for Bug Fixing
        int n3 = sc.nextInt(); // Developers for Code Review
        int d = sc.nextInt();  // Days for Feature Development
        int D = sc.nextInt();  // Total time available

        // Calculate the number of days required for each stage

        // Feature Development
        int featureDays = (int) Math.ceil((double) N / n1) * d;

        // Bug Fixing (takes d + 2 days per task)
        int bugDays = (int) Math.ceil((double) N / n2) * (d + 2);

        // Code Review (takes d + 4 days per task)
        int reviewDays = (int) Math.ceil((double) N / n3) * (d + 4);

        // Total days required is the sum since tasks are done sequentially
        int totalDaysRequired = featureDays + bugDays + reviewDays;

        // Output result
        if (totalDaysRequired <= D) {
            System.out.println("Yes " + totalDaysRequired);
        } else {
            System.out.println("No " + (totalDaysRequired - D));
        }

        sc.close();
    }
}
