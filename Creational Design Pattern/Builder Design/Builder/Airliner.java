// package Builder;

// import Builder.AirplaneBuilder;

public class Airliner extends AirplaneBuilder
{
    Airliner(String customer){
        super.customer = customer;
        super.type = "787 Dreamliner";
    }

    public void buildWings(){
        airplane.setWingspan(197f);
    }

    public void buildPowerplant(){
        airplane.setPowerplant("Dual Turbofan");
    }

    public void buildAvionics(){
        airplane.setAvionics("Commercial");
    }

    public void buildSeats()
    {
        airplane.setNumberSeats(8, 289);
    }
}
