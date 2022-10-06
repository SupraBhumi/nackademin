package games;

import java.util.Random;


public class Dice {

    public int numOfSides;

    //konstruktur anropas med keyword new
    public Dice(int numOfSides){
        this.numOfSides = numOfSides;
    }

    public int roll(){
        //int 1-6
        Random diceRandom = new Random();
        int result = diceRandom.nextInt(6)+1;

        return result;
    }



}
