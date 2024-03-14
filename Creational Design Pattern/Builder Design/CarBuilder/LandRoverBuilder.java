package CarBuilder;

public class LandRoverBuilder implements CarBuilder
{
    private Car c;
    public LandRoverBuilder()
    {
        this.c = new Car();
    }
    
    @ Override
    public void buildFuel()
    {
        c.setFuel("Diesel");
    }

    @ Override
    public void buildSeats()
    {
        c.setSeats(5);
    }

    @ Override
    public void buildType()
    {
        c.setType("SUV");
    }

    @ Override
    public void buildPrice()
    {
        c.setPrice(15000000);
    }

    public Car getCar()
    {
        Car newcar = this.c;
        this.c = new Car();
        return newcar;
    }
}
