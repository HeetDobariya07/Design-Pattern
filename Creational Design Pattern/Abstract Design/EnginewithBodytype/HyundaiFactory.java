package EnginewithBodytype;

class HyundaiFactory implements CarFactory
{
    @Override
    public Engine buildEngine()
    {
        return new DieselEngine();
    }
    @Override
    public BodyType buildBody()
    {
        return new Hatchback();
    }
}
