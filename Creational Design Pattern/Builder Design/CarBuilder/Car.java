package CarBuilder;

public class Car
{
    private String fuel;
    private int seats;
    private String cartype;
    private double price;

    public void setFuel(String fuel1)
    {
        this.fuel = fuel1;
    }

    public void setSeats(int seats1)
    {
        this.seats = seats1;
    }

    public void setType(String type1)
    {
        this.cartype = type1;
    }

    public void setPrice(double price1)
    {
        this.price = price1;
    }

    public void showCar()
    {
        System.out.println("Car [Fueltype ="+fuel+", No. of seats ="+seats+", Car Type =" +cartype+", Price ="+price+"]");
    } 
}    

