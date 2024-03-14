package CarBuilder;

public class CarMain 
{
    private CarBuilder cbuild;
    public CarMain(CarBuilder cbuild)
    {
        this.cbuild = cbuild;
    }

    public void buildCar()
    {
        cbuild.buildFuel();
        cbuild.buildSeats();
        cbuild.buildType();
        cbuild.buildPrice();
    }
}
