package EnginewithBodytype;

class TeslaFactory implements CarFactory
{
    @Override
    public Engine buildEngine()
    {
        return new EVMotor();
    }
    @Override
    public BodyType buildBody()
    {
        return new Sedan();
    }
}