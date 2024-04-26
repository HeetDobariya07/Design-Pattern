package Practise;

class Phone
{
    private String os;
    private int ram;
    private String processor;

    public Phone(String os, int ram, String processor)
    {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
    }

    public String toString()
    {
        return "Phone [OS="+os+", RAM="+ram+", Processor="+processor+"]";
    }
}

class PhoneBuilder
{
    private String os;
    private int ram;
    private String processor;
    public PhoneBuilder setOS(String os1)
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
    public Phone getPhone()
    {
        return new Phone(os, ram, processor);
    }
}

class BuilderDesign
{
    public static void main(String[] args) 
    {
        Phone ph = new PhoneBuilder().setOS("Android").setRam(8).getPhone();
        System.out.println(ph);
    }
}
