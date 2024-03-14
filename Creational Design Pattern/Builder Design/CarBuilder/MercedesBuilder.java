package CarBuilder;

public class MercedesBuilder implements CarBuilder
{
    private Car c;
    public MercedesBuilder()
    {
        this.c = new Car();
    }
    
    @ Override
    public void buildFuel()
    {
        c.setFuel("Petrol");
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
        c.setPrice(30000000);
    }

    public Car getCar()
    {
        Car newcar = this.c;
        this.c = new Car();
        return newcar;
    }
}
