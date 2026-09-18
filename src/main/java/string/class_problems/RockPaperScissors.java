import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player wins";
        }

        return "Computer wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"rock", "paper", "scissors"};

        System.out.print("Enter your move: ");
        String playerMove = sc.nextLine().toLowerCase();

        String computerMove = moves[random.nextInt(3)];

        System.out.println("Computer move: " + computerMove);
        System.out.println(playRound(playerMove, computerMove));

        sc.close();
    }
}