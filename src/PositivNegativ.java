import java.util.Scanner;

public class PositivNegativ {
    public static void main(String[] args) {

        //anropa av metod
            exer1();
    }

    //deklaration av metoder
    public static void exer1(){

        Scanner antal = new Scanner(System.in);

        System.out.print("ange talet : ");
        int inputTal = 0;
        inputTal = antal.nextInt();

        if(inputTal > 0){
            System.out.println("talet är positiv");
        } else if (inputTal < 0) {
            System.out.println("talet är negativ");
        } else {
            System.out.println("antalet 0 är undefined");
        }

    }
}
