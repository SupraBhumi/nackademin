import java.util.Random;
import java.util.Scanner;

//Inlämningsuppgift - kasta tärning

public class Dice {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int dice = (int) (Math.random() * 6) + 1;  // + 1 betyder att det ska börja med 1

        System.out.println("the dice is " + dice);

        while (true){
            System.out.print("Guess the a number between 1-6 : ");
            // int dice = random.nextInt(7) + 1;
            // int dice = (int)(6.0 * Math.random())+1;
            int input = scanner.nextInt();
            if (input == dice) {
                System.out.println("The dice is "+ dice + ", You win!");
                break;
            }
            else if (input > 6) {
                System.out.println("You have to guess a number between 1 and 6, try again.");
            }
            else {
                System.out.println("Try again");
            }
        }

    }
}

