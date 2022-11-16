package garage;

abstract class VehicleByRegNo {          //abstract klass

    protected String ID;                     //protected variabel
    protected String Brand;

    VehicleByRegNo(String ID, String brand) {       //konstrucktur ID och brand
        this.ID = ID;
        this.Brand = brand;
    }

    public String getID(){                           //getter method för att hämta ID

        return ID;
    }

    public void setID(String ID){                          //setter för ID

        this.ID = ID;
    }

    public String getBrand(){                                //getter method för att hämta Brand

        return Brand;
    }

    public void setBrand(String brand){                        //setter för Brand

        Brand = brand;
    }

    public String getVehicleByRegNo(){

        return ("");
    }
}

