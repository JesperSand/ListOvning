import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = "";
        ArrayList<Integer> scores = new ArrayList<Integer>();
        //asks the user to input score
        while (!userInput.equalsIgnoreCase("Done")) {
            System.out.println("Enter score (or 'done' to finish):");
            userInput = sc.nextLine();
            //adds input to list
            if (!userInput.equalsIgnoreCase("done")) {
                int score = Integer.parseInt(userInput);
                scores.add(score);
            }
        }
        //shows the score on screen in order of input
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
        }
        calculateAndPrintResults(scores);

    }

    public static void calculateAndPrintResults(ArrayList<Integer> scores) {
        int total = 0;
        int highest = 0;

        for (int score : scores) {
            total += score;
            if (score > highest) {
                highest = score;
            }
        }

        double average = (double) total / scores.size();

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
    }
}