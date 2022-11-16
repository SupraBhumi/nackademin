package garage;


import java.util.Scanner;

public class Main {

  //  static int slots = 5;
   // static int NumEmptySlots = slots;
 //   static VehicleByRegNo[] park = new VehicleByRegNo[slots];


    public static void main(String[] args) {

        System.out.println("\n----Welcome to stilt car park----");
        System.out.println("\nWhat do you want to do? \n1. Park the Vehicle  \n2. Take the Vehicle back  \n3. Exit");

            while (true) {
                Scanner inl = new Scanner(System.in);
                System.out.println("Enter your choice: ");
                int vl = inl.nextInt();
                switch (vl) {                                                 //choice 1. Park the Vehicle
                    case 1:
                        Scanner vehicle = new Scanner(System.in);
                        System.out.println("\nEnter your details \nVehicle Type (1:Car 2:Motorcycle 3:Bus 4:Boat 5:Airplane) : ");
                        int vType = vehicle.nextInt();

                        switch (vType) {                                         //för Car
                            case 1:
                                System.out.println("ID : ");
                                String plate = vehicle.next();
                                System.out.println("Brand : ");
                                String brand = vehicle.next();
                                System.out.println("Year : ");
                                int year = vehicle.nextInt();
                                System.out.println("Color : ");
                                String color = vehicle.next();
                                System.out.println();
                                VehicleByRegNo ncar = new Car(plate, brand, year, color);
                                // Vobj.vehicleEntered(ncar);
                                //  System.out.println("Car of ID : " + plate + " added to slot");
                                System.out.println(ncar);

                        }
                        switch (vType) {                                             //För Motorcycle
                            case 2:
                                System.out.println("ID : ");
                                String plate = vehicle.next();
                                System.out.println("Brand : ");
                                String brand = vehicle.next();
                                System.out.println("Year : ");
                                int year = vehicle.nextInt();
                                System.out.println("Color : ");
                                String color = vehicle.next();
                                System.out.println();
                                VehicleByRegNo nmotorc = new Motorcycle(plate, brand, year, color);
                                //  Vobj.vehicleEntered(nmotorc);
                                //  System.out.println("Motorcycle of ID : " + plate + " added to slot");
                                System.out.println(nmotorc);


                        }
                        switch (vType) {                                                 //För Bus
                            case 3:
                                System.out.println("ID : ");
                                String plate = vehicle.next();
                                System.out.println("Brand : ");
                                String brand = vehicle.next();
                                System.out.println("Year : ");
                                int year = vehicle.nextInt();
                                System.out.println("Color : ");
                                String color = vehicle.next();
                                System.out.println();
                                VehicleByRegNo nbus = new Bus(plate, brand, year, color);
                                //      Vobj.vehicleEntered(nbus);
                                //     System.out.println("Bus of ID : " + plate + " added to slot");
                                System.out.println(nbus);


                        }
                        switch (vType) {                                                 //För Boat
                            case 4:
                                System.out.println("ID : ");
                                String plate = vehicle.next();
                                System.out.println("Brand : ");
                                String brand = vehicle.next();
                                System.out.println("Year : ");
                                int year = vehicle.nextInt();
                                System.out.println("Color : ");
                                String color = vehicle.next();
                                System.out.println();
                                VehicleByRegNo nboat = new Boat(plate, brand, year, color);
                                //    Vobj.vehicleEntered(nboat);
                                //     System.out.println("Boat of ID : " + plate + " added to slot");
                                System.out.println(nboat);


                        }
                        switch (vType) {                                                 //För Airplane
                            case 5:
                                System.out.println("ID : ");
                                String plate = vehicle.next();
                                System.out.println("Brand : ");
                                String brand = vehicle.next();
                                System.out.println("Year : ");
                                int year = vehicle.nextInt();
                                System.out.println("Color : ");
                                String color = vehicle.next();
                                System.out.println();
                                VehicleByRegNo nairplane = new Airplane(plate, brand, year, color);
                                //    Vobj.vehicleEntered(nairplane);
                                //    System.out.println("Airplane of ID : " + plate + " added to slot");
                                System.out.println(nairplane);


                        }
                }


                switch (vl) {                                                    //Choice 2. Take the Vehicle back
                    case 2:
                        System.out.println("\nEnter ID : ");
                        Scanner getplate = new Scanner(System.in);
                        String plate = getplate.next();
                        //    Vobj.vehicleLefts(plate);
                        //   VehicleByRegNo detail = new VehicleByRegNo(plate, brand, year, color);

                        System.out.println("\nID : " + plate + " has removed");
                        System.out.println("_________________________________");
                     //   park = null;
                }
            
            
         /*
            switch (vl){                                                    //Choice 3. View the Vehicle detail
                case 3:
                    System.out.println("\nEnter ID : ");
                    Scanner getplate = new Scanner(System.in);
                    String plate = getplate.next();
                    //    Vobj.vehicleLefts(plate);
                    VehicleByRegNo.toString (plate, brand, year, color);
                    System.out.println("Detail for ID : " + plate + ());


            }
            
          */


                switch (vl) {                                                       //Choice 4. Exit
                    case 3:
                        System.out.println("Exiting..");
                        System.exit(0);
                }
                System.out.println("\nWhat do you want to do? \n1. Park the Vehicle  \n2. Take the Vehicle back  \n3. Exit");
            }



        }
    }







