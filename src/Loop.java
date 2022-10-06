import java.util.Scanner;

//Uppgift 7 "multiplication"

public class Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int number = 0;
       int number = scanner.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(number + "x" + i + "=" + number * i);
        }

    }
}
