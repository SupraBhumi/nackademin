import java.util.Scanner;

//Uppgift 5

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ange ett tal mellan 1-7: ");
        int week = input.nextInt();
        String name;

        switch (week) {
            case 1 :
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3 :
                name = "Wednesday";
                break;
            case 4 :
                name = "Thursday";
                break;
            case 5 :
                name = "Friday";
                break;
            case 6 :
                name = "Saturday";
                break;
            case 7 :
                name = "Sunday";
                break;

            default:
                name = "fel";
                break;
        }

        System.out.println(name);


    }
}

