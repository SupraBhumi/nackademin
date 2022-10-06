import java.util.Scanner;

//Uppgift 3 "räkna ut vilken som är störst"

public class LargestTal {
    public static void main(String[] args) {

        Scanner antal = new Scanner(System.in);

        System.out.print("ange första talet : ");
        int inputTalFirst = 0;
        inputTalFirst = antal.nextInt();



        System.out.print("ange andra talet : ");
        int inputTalSecond = 0;
        inputTalSecond = antal.nextInt();


        if(inputTalFirst > inputTalSecond){
            System.out.println(inputTalFirst + " är största än " + inputTalSecond);
        }
        else{
        System.out.println(inputTalSecond + " är största än " + inputTalFirst);

        }
    }
}


