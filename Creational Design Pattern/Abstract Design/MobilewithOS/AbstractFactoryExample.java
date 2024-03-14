// Client Code
public class AbstractFactoryExample 
{
    public static void main(String[] args) 
    {
        MobileFactory samsungFactory = new SamsungFactory();
        Mobile samsungMobile = samsungFactory.createMobile();
        OS samsungOS =  samsungFactory.createOS();

        samsungMobile.displayInfo();
        samsungOS.displayOS();

        MobileFactory nokiaFactory = new NokiaFactory();
        Mobile nokiaMobile = nokiaFactory.createMobile();
        OS nokiaOS =  nokiaFactory.createOS();

        nokiaMobile.displayInfo();
        nokiaOS.displayOS();

        MobileFactory appleFactory = new AppleFactory();
        Mobile appleMobile = appleFactory.createMobile();
        OS appleOS =  appleFactory.createOS();

        appleMobile.displayInfo();
        appleOS.displayOS();
    }    
}
