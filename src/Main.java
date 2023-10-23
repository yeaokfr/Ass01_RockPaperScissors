import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String p1;
        String p2;
        String choice;

        do {
            // Player 1's turn
            System.out.println("Player 1, Rock, Paper, or Scissors?");
            do {
                if (scan.hasNextLine()) {
                    p1 = scan.nextLine();
                    if (p1.equalsIgnoreCase("r")) {
                        break;
                    }
                    if (p1.equalsIgnoreCase("p")) {
                        break;
                    }
                    if (p1.equalsIgnoreCase("s")) {
                        break;
                    }
                }
                System.out.println("Please enter a valid input (R,P,S)");
            } while (true);

            // Player 2's turn
            System.out.println("Player 2, Rock, Paper, or Scissors?");
            do {
                if (scan.hasNextLine()) {
                    p2 = scan.nextLine();
                    if (p2.equalsIgnoreCase("r")) {
                        break;
                    }
                    if (p2.equalsIgnoreCase("p")) {
                        break;
                    }
                    if (p2.equalsIgnoreCase("s")) {
                        break;
                    }
                }
                System.out.println("Please enter a valid input (R,P,S)");
            } while (true);

            // Player 1 winning scenarios
            if (p1.equalsIgnoreCase("r") && p2.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors, Player 1 wins");
            } else if (p1.equalsIgnoreCase("p") && p2.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock, Player 1 wins");
            } else if (p1.equalsIgnoreCase("s") && p2.equalsIgnoreCase("p")) {
                System.out.println("Scissors cuts paper, Player 1 wins");

                // Player 2 winning scenarios
            } else if (p1.equalsIgnoreCase("s") && p2.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors, Player 2 wins");
            } else if (p1.equalsIgnoreCase("r") && p2.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock, Player 2 wins");
            } else if (p1.equalsIgnoreCase("p") && p2.equalsIgnoreCase("s")) {
                System.out.println("Scissors cuts paper, Player 2 wins");

                // Draw
            } else {
                System.out.println("The game was a draw");
            }

            // Check to play again
            System.out.println("Play again? [Y/N] (MUST TYPE Y TO CONTINUE PLAYING!!!)");
            choice = scan.nextLine();
        } while (choice.equalsIgnoreCase("y"));
    }
}