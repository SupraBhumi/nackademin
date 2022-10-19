package games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    boolean playerWins;
    Player player;
    Fist aIFist;

    //konstruktur

    //@TODO: if the constructor is not declared as public it will not be able to call it from outside of the package
    public RockPaperScissorsGame(String playerName, int playerScore) {
        player = new Player();
        aIFist = new Fist();

        //anropa den privata variable utifrån setPlayer och döpa till ett namn och score i main klass
        player.setPlayer("Supra");
        player.setScore(0);
        //anropa den utvalda variable (this.name/ this.score..) utifrån setPlayer som kommer visa på main klass
       // player.displayPlayer();
        player.toString();
    }

    public static void main(String[] args) {

        RockPaperScissorsGame game = new RockPaperScissorsGame("Marcus",0);
        game.playGame();

    }


     void playGame() {

        while (true) {

            Scanner scanner = new Scanner(System.in);


            //@TODO: call the method Fist.play() instead
          String[] rps = {"Rock", "Paper", "Scissors"};
          String stringResult = rps[aIFist.play()/*new Random().nextInt(rps.length)*/];
          //Fist.play();

            String choice;

            while (true) {
                System.out.print("Rock! Paper! Scissors! Please choose your move : ");
                choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Scissors") || choice.equalsIgnoreCase("Paper")) {
                    break;
                }
                System.out.println(choice + " is not a valid move, please choose Rock, Paper or Scissors");
            }

//
            System.out.println("Computer play : " + stringResult);

            if (choice.equalsIgnoreCase(stringResult)) {
                    System.out.println("The game was a tie!");
                    playerWins = false;
            } else if (choice.equalsIgnoreCase("Rock")) {
                if (stringResult.equalsIgnoreCase("Paper")) {
                    System.out.println("You lost");
                    playerWins = false;
                } else if (stringResult.equalsIgnoreCase("Scissors")) {
                    System.out.println("You win!");
                    playerWins = true;
                }
            } else if (choice.equalsIgnoreCase("Scissors")) {
                if (stringResult.equalsIgnoreCase("Rock")) {
                    System.out.println("You lost");
                    playerWins = false;
                } else if (stringResult.equalsIgnoreCase("Paper")) {
                    System.out.println("You win!");
                    playerWins = true;
                }
            } else if (choice.equalsIgnoreCase("Paper")) {
                if (stringResult.equalsIgnoreCase("Scissors")) {
                    System.out.println("You lost");
                    playerWins = false;
                } else if (stringResult.equalsIgnoreCase("Rock")) {
                    System.out.println("You win!");
                    playerWins = true;
                }
            }

            if (playerWins==true){
                player.setScore(player.getScore() +1);
            }



            System.out.println("Player score is : " + player.getScore());
            System.out.print("Play again? (yes/no) : ");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("Yes")) {
                break;
            }

        }
    }
}