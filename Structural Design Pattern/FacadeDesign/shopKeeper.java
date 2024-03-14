public class shopKeeper 
{
    // facade which hides the implementation
    public static String deliverPhone(PhoneType phoneType)
    {
        components comp = new components();
        switch(phoneType)
        {
            case iPhone:
                Phone iPh = new iPhone();
                String phComp = comp.getiPhoneComponents();
                iPh.builtPhone(phComp);
                return iPh.deliverPhone();
            
            case Android:
                Phone Android = new AndroidPhone();
                String PhComp = comp.getAndroidComponents();
                Android.builtPhone(PhComp);
                return Android.deliverPhone();
        }
        return null;
    }
}
