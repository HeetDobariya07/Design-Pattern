package PhoneBuilder2;

public class Phone
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

    public void showPhone()
    {
        System.out.println("Phone [OS ="+os+", RAM ="+ram+", Processor =" +processor+", Screensize ="+screensize+", Battery ="+battery+"]");
    } 
}