package FactoryDesign2;

public class EngineMain 
{
    public static void main(String[] args) 
    {
        EngineFactory ftf = new EngineFactory();
        FuelType obj = ftf.getInstance("Grawl");
        obj.spec();
    }
}
