// Concrete Factories SamsungFactory, NokiaFactory, AppleFactory
class SamsungFactory implements MobileFactory
{
    @Override
    public Mobile createMobile()
    {
        return new SamsungMobile();
    }
    @Override
    public OS createOS()
    {
        return new AndroidOS();
    }
}
