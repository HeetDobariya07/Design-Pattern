package PhoneBuilder2;

public class Shop
{
    public static void main(String[] args) 
    {
        Phone samsung = new SamsungPhoneBuilder().setOs("Android").setRam(6).setProcessor("Snapdragon").setBattery(5000).getPhone();
        System.out.println("Samsung Phone: "+samsung);
        Phone iPhone = new iPhonePhoneBuilder().setOs("iOS").setRam(4).setScreensize(4.5).getPhone();
        System.out.println("iPhone Phone: "+iPhone);
    }
}
