import java.util.Scanner;  //importera scanner

public class HelloWorld {
    //från och med nu finns det en Scanner som herter Scanner
    public static void main(String[] args) {  // 'psvm' förkortning - deklarela metod
        Scanner scanner = new Scanner(System.in);


/*
        ///uppgift 5
        System.out.print("Input first number : ");
        int number1 = scanner.nextInt();    //döp till små bokstaver på variable
        System.out.println("First number is "+ number1);

        System.out.print("Input second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Second number is "+ number2);
        System.out.println("Summan av total är : " + (number1+number2));
*/


        //uppgift 6
        System.out.print("Input first number : ");
        int number1 = scanner.nextInt();
        System.out.println("First number is "+ number1);

        System.out.print("Input second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Second number is "+ number2);

        System.out.println("Summan av total är : " + number1 + "+" + number2 + "=" + (number1+number2));
        System.out.println("Summan av total är : " + number1 + "-" + number2 + "=" + (number1-number2));
        System.out.println("Summan av total är : " + number1 + "*" + number2 + "=" + (number1*number2));
        System.out.println("Summan av total är : " + number1 + "/" + number2 + "=" + (number1/number2));



        /*
        System.out.println("Hello World\nSupra Bhumisisawang");   // 'sout' förkortning/ \n = ny rad/ (option+shift+7)
        System.out.println(74+36); //addition
        System.out.println(50/3); //svaret blir heltal
        System.out.println(50.0/3);  //svaret blir decimaltal
        System.out.println(Math.floor(50.0/3));



        System.out.println((8*6)-5);
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5)/8);
        System.out.println(5+(15/3*2)-8%3);

*/

    }

}
