package EnginewithBodytype;

// Concrete Products of Engine: PetrolEngine, DieselEngine, EVMotor
class PetrolEngine implements Engine
{
    @Override
    public void displayEngine()
    {
        System.out.println("Powered by Petrol, which gives mind blowing thrust!");
    }
}
