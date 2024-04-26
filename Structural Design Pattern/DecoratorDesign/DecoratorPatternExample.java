interface Coffee 
{
    String getDescription();
    double cost();
}

class SimpleCoffee implements Coffee
{
    @Override
    public String getDescription()
    {
        return "Simple Coffee";
    }

    @Override
    public double cost()
    {
        return 30.0;
    }
}

abstract class CoffeeDecorator implements Coffee
{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription();
    }
    @Override
    public double cost()
    {
        return decoratedCoffee.cost();
    }
}

class MilkDecorator extends CoffeeDecorator
{
    public MilkDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
    }
     @Override
    public String getDescription()
    {
        return super.getDescription() + ", with Milk";
    }
    @Override
    public double cost()
    {
        return super.cost() + 5.5;
    }
}

class SugarDecorator extends CoffeeDecorator
{
    public SugarDecorator(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
    }
     @Override
    public String getDescription()
    {
        return super.getDescription() + ", with Sugar";
    }
    @Override
    public double cost()
    {
        return super.cost() + 3.5;
    }
}

public class DecoratorPatternExample
{
    public static void main(String[] args) 
    {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost() + ", Description: " + coffee.getDescription());
        // Decorate the simple coffee with milk
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());
        // Decorate the simple coffee with sugar
        Coffee sweetCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sweetCoffee.cost() + ", Description: " + sweetCoffee.getDescription());    
    }
}