package EnginewithBodytype;

public class Client 
{
    public static void main(String[] args) 
    {
        System.out.println("For Petrol SUVs:");
        CarFactory mercedesFactory = new MercedesFactory();
        Engine petrolEngine = mercedesFactory.buildEngine();
        BodyType suv = mercedesFactory.buildBody();

        petrolEngine.displayEngine();
        suv.displayBody();

        System.out.println("For Diesel Hatchbacks:");
        CarFactory suzukiFactory = new HyundaiFactory();
        Engine dieselEngine = suzukiFactory.buildEngine();
        BodyType hatchback = suzukiFactory.buildBody();

        dieselEngine.displayEngine();
        hatchback.displayBody();

        System.out.println("For EV Sedans:");
        CarFactory teslaFactory = new TeslaFactory();
        Engine evMotor = teslaFactory.buildEngine();
        BodyType sedan = teslaFactory.buildBody();

        evMotor.displayEngine();
        sedan.displayBody();
    }    
}

