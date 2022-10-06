import java.util.Random;
import java.util.Scanner;

//Inlämningsuppgift - sten, sax, påse

public class StenSaxPose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String[] rps = {"r", "p", "s"};

            String computer = rps[new Random().nextInt(rps.length)];
            String input;

            while (true) {
                System.out.print("Rock! Paper! Scissors! Please choose your move (r, p, s) : ");
                input = scanner.nextLine();
                if (input.equals("r") || input.equals("s") || input.equals("p")) {
                    break;
                }
                System.out.println(input + " is not a valid move, please choose r, p or s");
            }


            System.out.println("Computer play : " + computer);


            if (input.equals(computer)) {
                System.out.println("The game was a tie!");
            } else if (input.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("You lost");
                } else if (computer.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (input.equals("s")) {
                if (computer.equals("r")) {
                    System.out.println("You lost");
                } else if (computer.equals("p")) {
                    System.out.println("You win!");
                }
            } else if (input.equals("p")) {
                if (computer.equals("s")) {
                    System.out.println("You lost");
                } else if (computer.equals("r")) {
                    System.out.println("You win!");
                }
            }

            System.out.print("Play agian? (y/n) : ");
            String playAgian = scanner.nextLine();

            if (!playAgian.equals("y")) {
                break;
            }


        }
    }
}
