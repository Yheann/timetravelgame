import java.util.ArrayList;
import java.util.Scanner;

public class TimeTraveler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<String>();
        history.add("Ancient Egypt");
        history.add("Medieval Europe");
        history.add("World War II");
        history.add("The Future");

        int currentLevel = 0;
        String currentPeriod = history.get(currentLevel);

        System.out.println("Welcome to Time Traveler! You are currently in " + currentPeriod + ".");

        while (currentLevel < history.size()) {
            // Display the puzzle for the current level
            String puzzle = getPuzzle(currentPeriod);
            System.out.println(puzzle);

            // Get the user's answer to the puzzle
            String answer = input.nextLine().toLowerCase();

            // Check if the answer is correct
            boolean isCorrect = checkAnswer(answer, currentPeriod);

            // If the answer is correct, move to the next level
            if (isCorrect) {
                System.out.println("Congratulations, you solved the puzzle!");
                currentLevel++;
                if (currentLevel < history.size()) {
                    currentPeriod = history.get(currentLevel);
                    System.out.println("You have traveled to " + currentPeriod + ".");
                } else {
                    System.out.println("Congratulations, you have completed all the puzzles!");
                }
            } else {
                System.out.println("Sorry, that is not the correct answer. Please try again.");
            }
        }
    }

    public static String getPuzzle(String period) {
        // TODO: Add logic to return a puzzle for the given period
        return "What is the answer to the puzzle?";
    }

    public static boolean checkAnswer(String answer, String period) {
        // TODO: Add logic to check if the answer is correct for the given period
        return answer.equals("correct answer");
    }
}

