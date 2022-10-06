import java.util.Scanner;

//Uppgift 4 "använding av floting point number: float eller double"

public class MathFloor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv första antalet : ");    //använd kommatecken "," istället för punkt "."
        double firstDouble = input.nextDouble();

        System.out.print("Skriv abdra antalet : ");      //använd kommatecken "," istället för punkt "."
        double secondDouble = input.nextDouble();


        //math floor (förkortning av decimaler), *100 och /100 = två decimaler ,*1000 och /1000 = tre decimaler

        firstDouble = firstDouble * 1000;
        secondDouble = secondDouble * 1000;

        firstDouble = Math.floor(firstDouble);
        secondDouble = Math.floor(secondDouble);

        firstDouble = firstDouble / 1000;
        secondDouble = secondDouble / 1000;

        System.out.println("First double : " + firstDouble + " ,Second double : " + secondDouble);





    }
}
