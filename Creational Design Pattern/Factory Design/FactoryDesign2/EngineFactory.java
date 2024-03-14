package FactoryDesign2;

public class EngineFactory 
{
    public FuelType getInstance(String str)
    {
        if (str.equals("Grawl"))
            return new Petrol();
        else if (str.equals("Smoky"))
            return new Diesel();
        else 
            return new Hybrid();
    }
}
