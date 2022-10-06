package games;

import java.util.Scanner;

public class DiceGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //för att få in input från användaren

        Dice dice = new Dice(6);
        Player nadja = new Player();

        int result = dice.roll();
        int numOfGuesses = 0;


        for (int i = 0; i < 3; i++) {

           boolean guessIsOutOfBounds = true;
           int guess =0;

           while (guessIsOutOfBounds) {
               System.out.print("Guess what the dice rolled : ");
               guess = scanner.nextInt();
               if (guess>= 1 && guess <=6){
                   guessIsOutOfBounds = false;
               }
           }

        System.out.println("You guess : " + guess);

        if (guess == result) {
            System.out.println("The dice roll is : " + result + "\n" + ", You guess : " + guess + " You win");
            break;
        }
        else {
            System.out.println("Wrong guess! You have " + (2-i) + " guess left" );
            numOfGuesses++;
        }

        //Kan använda med else-if också
        if (numOfGuesses > 2){
            System.out.println("You lost forever");
        }

        }  //for
    }
}
