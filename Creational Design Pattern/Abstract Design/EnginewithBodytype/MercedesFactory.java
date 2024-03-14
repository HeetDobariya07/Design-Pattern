package EnginewithBodytype;

class MercedesFactory implements CarFactory
{
    @Override
    public Engine buildEngine()
    {
        return new PetrolEngine();
    }
    @Override
    public BodyType buildBody()
    {
        return new SUV();
    }
}
