import java.util.Scanner;
public class AreaOmkrets {
    public static void main(String[] args) {

        //Uppgift 11 "area och omkrets"

        //radie som input
        //formel är >> pie = perimeter / diameter (radie * 2)
                // pie * (radie *2)= perimeter
        Scanner input = new Scanner(System.in);

        System.out.print("Radius? : ");
        double radius = input.nextDouble();

        double area = Math.PI * (radius*radius);
        double omkrets = Math.PI * (radius*2);

        //math floor (förkortning av decimaler), *100 och /100 = två decimaler ,*1000 och /1000 = tre decimaler

        area = area * 100;
        omkrets = omkrets * 100;

        area = Math.floor(area);
        omkrets = Math.floor(omkrets);

        area = area / 100;
        omkrets = omkrets / 100;

        System.out.println("Area är : " + area + ", Omkrets är : " + omkrets);


    }
}
