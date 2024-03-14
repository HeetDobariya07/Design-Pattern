package PhoneBuilder;

public class Shop
{
    public static void main(String[] args) 
    {
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3100).getPhone();
        System.out.println(p);
        // You can set the no. of parameters by yourself sequence does not matter, set them in any order

        // If you don't want the above cascaded calls for Phone Object creation 
        // then create PhoneBuilder1 class object and execute the setters call separately
        PhoneBuilder1 p1 = new PhoneBuilder1();
        p1.setOs("Android");
        p1.setRam(16);
        p1.setBattery(5000);
        System.out.println(p1.getPhone());
    }
}
