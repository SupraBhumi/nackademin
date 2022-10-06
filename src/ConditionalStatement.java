import java.util.Random;
import java.util.Scanner;   //mata in saker

//Uppgift 1 "udda eller jämnt"

public class ConditionalStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int inputTal = 0;

        System.out.print("ange talet : ");
        inputTal = input.nextInt();

        if(inputTal%2 == 0){      //om antalet kan delar med 2 är like med 0 är jämnt
            System.out.println("jämnt");
        }else {
            System.out.println("udda");
        }



    }
}

