class Phone
{
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone(String os, int ram, String processor, double screensize, int battery)
    {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;
    }

    @Override
    public String toString()
    {
        return "Phone [OS ="+os+", RAM ="+ram+", Processor =" +processor+", Screensize ="+screensize+", Battery ="+battery+"]";
    } 
}

class PhoneBuilder 
{
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBuilder setOs(String os1)
    {
        this.os = os1;
        return this;
    }

    public PhoneBuilder setRam(int ram1)
    {
        this.ram = ram1;
        return this;
    }

    public PhoneBuilder setProcessor(String processor1)
    {
        this.processor = processor1;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize1)
    {
        this.screensize = screensize1;
        return this;
    }

    public PhoneBuilder setBattery(int battery1)
    {
        this.battery = battery1;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(os, ram, processor, screensize, battery);
    }
}

class PhoneBuilder1 
{
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public void setOs(String os1)
    {
        this.os = os1;
    }

    public void setRam(int ram1)
    {
        this.ram = ram1;
    }

    public void setProcessor(String processor1)
    {
        this.processor = processor1;
    }

    public void setScreensize(double screensize1)
    {
        this.screensize = screensize1;
    }

    public void setBattery(int battery1)
    {
        this.battery = battery1;
    }

    public Phone getPhone()
    {
        return new Phone(os, ram, processor, screensize, battery);
    }
}

class PhoneShop
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
