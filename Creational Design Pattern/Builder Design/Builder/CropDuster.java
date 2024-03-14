// package Builder;

// import Builder.AirplaneBuilder;

public class CropDuster extends AirplaneBuilder
{
    CropDuster(String customer){
        super.customer = customer;
        super.type = "Crop Duster v3.4";
    }

    public void buildWings(){
        airplane.setWingspan(9f);
    }

    public void buildPowerplant(){
        airplane.setPowerplant("Single Piston");
    }

    public void buildAvionics() {}

    public void buildSeats()
    {
        airplane.setNumberSeats(1, 1);
    }
}
