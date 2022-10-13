package games;

import java.util.Random;

public class Fist {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    private Random random;

    //@TODO: if the constructor is not declared as public it will not be able to call it from outside of the package
    Fist() {
        random = new Random();
    }

    //@FIXME: the method returns 0 every time. Make it return a ramdom number 0 <-> 2
    //en metod som när den anropas returnerar 0, 1 eller 2
    public int play(){
        Random random = new Random();
        return 0;
    }


}
