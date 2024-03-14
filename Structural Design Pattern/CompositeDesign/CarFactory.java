import java.util.ArrayList;
import java.util.List;
// import java.util.*;

interface Component
{
    void showPrice();
    int getPrice();
}

class Leaf implements Component
{
    int price;
    String name;

    Leaf(String name, int price)
    {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice()
    {
        System.out.println("Leaf -> "+name+" : "+price);
    }
    @Override
    public int getPrice()
    {
        return price;
    }
}

class Composite implements Component
{
    String name;
    List<Component> components = new ArrayList();

    public Composite(String name)
    {
        super();
        this.name = name;
    }
    public void addComponent(Component com)
    {
        components.add(com);
    }
    @Override
    public int getPrice()
    {
        int p=0;
        for(Component c:components)
        {
            p += c.getPrice();
        }
        return p;
    }
    @Override
    public void showPrice()
    {
        System.out.println("Composite -> "+name+" : Price -> "+getPrice());
        System.out.println("Leaf of "+name);
        for(Component c:components)
        {
            c.showPrice();
        }
    }
}

public class CarFactory
{
    public static void main(String[] args) 
    {
        Component seats = new Leaf("Seats", 40000);    
        Component chassis = new Leaf("Chassis", 500000);
        Component doors = new Leaf("Doors", 100000);
        Component trunk = new Leaf("Trunk", 20000);
        Component hood = new Leaf("Hood", 50000);
        Component engine = new Leaf("Engine", 500000);
        Component drivetrain = new Leaf("Drivetrain", 700000);
        Component gearbox = new Leaf("Gearbox", 350000);

        Composite body = new Composite("Body");
        Composite engineBlock = new Composite("Engine Block");
        Composite car = new Composite("Car");

        body.addComponent(seats);
        body.addComponent(chassis);
        body.addComponent(doors);
        body.addComponent(trunk);
        body.addComponent(hood);

        engineBlock.addComponent(engine);
        engineBlock.addComponent(drivetrain);
        engineBlock.addComponent(gearbox);

        car.addComponent(body);
        car.addComponent(engineBlock); 

        car.showPrice();
    }
}



