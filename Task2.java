import java.util.Scanner;

// creating a student grade calculator
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("welcome to student grade calculator");
        // Input marks obtained in each subject
        System.out.println("Enter your marks obtained (out of 100) in each subject:");
        String [] subject = {"English","Hindi","Maths","science","Social-studies"};
        int[] marks = new int[5]; // Assuming there are 5 subjects
        for (int i = 0; i < marks.length; i++) {
            System.out.print( subject[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / marks.length;
        boolean pass_fail = false;
        // Assign grades
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
            pass_fail = true;
        }

        // Display results
        System.out.println(name+" this is your allover result:");
        System.out.println("Total Marks: " + totalMarks + " out of 500");
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        if (pass_fail){
            System.out.println("sorry "+name+" you fail the exam");
        }else {
            System.out.println("congratulation "+name+" you pass the exam");
        }

        scanner.close();

    }
}
