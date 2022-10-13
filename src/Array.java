public class Array {
    public static void main(String[] args) {

        //skapa en ny String array
        String[] kvalit22 = new String[33];
        //lägga in namnet i kvalit22
        kvalit22 [0] = "A";
        kvalit22 [1] = "B";
        kvalit22 [2] = "C";

        //Skapa en ny int array
        int[] ages = new int[33];
        //Lägga in värden i ages
        ages[0] = 20;
        ages[1] = 25;
        ages[2] = 30;

        //skapa en ny int array och ge indexen initialvärden
        int[] ages2 = {20,30,40,50,60};
        int sum = 0;

        for (int i : ages2)
            sum += i;
        System.out.println("Summan är : " + sum);

        System.out.println(ages[0] + " " + ages[1] + " " + ages[2]);

    }
}
