import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("Enter your move (rock, paper, or scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            int computerMove = random.nextInt(3); // 0: Rock, 1: Paper, 2: Scissors

            String[] moves = {"rock", "paper", "scissors"};
            String computerMoveString = moves[computerMove];

            System.out.println("Computer move: " + computerMoveString);

            if (playerMove.equals(computerMoveString)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMoveString.equals("scissors")) ||
                       (playerMove.equals("paper") && computerMoveString.equals("rock")) ||
                       (playerMove.equals("scissors") && computerMoveString.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing Rock, Paper, Scissors!");
    }
}
