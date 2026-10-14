import java.util.Scanner;

public class IT23667082Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

	//Validates that exam marks are between 0 and 100 inclusive, OR – if either condition is true, the mark is invalid//
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return; //Exits the main method immediately, stopping the program//
        }



        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();

	//Validates lab marks//
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }


	//Prompts for exam percentage//
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

	//Prompts for lab percentage//
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();


	//Checks if the two percentages add up to 100//
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }


	//Calculates the weighted final mark//
        double finalMark = examMarks * examPercentage / 100 + labMarks * labPercentage / 100;

        System.out.println("Final Exam Mark is : " + finalMark);

        input.close();
    }
}