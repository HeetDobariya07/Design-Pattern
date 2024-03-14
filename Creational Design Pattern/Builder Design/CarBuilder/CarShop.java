package CarBuilder;

public class CarShop 
{
    public static void main(String[] args) 
    {
        CarBuilder cbuild;
        CarMain cmain;
        Car c;

        cbuild = new MercedesBuilder();
        cmain = new CarMain(cbuild);
        cmain.buildCar();
        c = cbuild.getCar();
        c.showCar();
    }
}
