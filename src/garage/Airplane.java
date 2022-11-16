package garage;


public class Airplane extends VehicleByRegNo {
    private int yearOfManufacturing;
    private String Color;

    //konstruktur
    Airplane(String ID, String brand, int yearOfManufacturing, String color){
        super(ID, brand);                                       //anropa superklass konstruktur VehicleByRegNo()
        this.yearOfManufacturing = yearOfManufacturing;
        this.Color = color;

    }

    public int getYearOfManufacturing(){
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing){
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String color){
        this.Color = color;
    }
/*
    public String getListVehiclesByType (){
        return ("Airplane");
    }

 */

    public String toString(){
        return  "Airplane of ID : " + getID() + " added to slot" + "\nAirplane Details : ID = " + getID() +  ", Brand = " + getBrand() + ", Year = " + getYearOfManufacturing() + ", Color = " + getColor();
    }
}

