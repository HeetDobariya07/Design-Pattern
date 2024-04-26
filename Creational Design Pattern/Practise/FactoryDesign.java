package Practise;
interface OS
{
    public void spec();
}

class Android implements OS
{
    public void spec()
    {
        System.out.println("OS is Android");
    }
}

class iOS implements OS
{
    public void spec()
    {
        System.out.println("OS is iOS");
    }
}

class Windows implements OS
{
    public void spec()
    {
        System.out.println("OS is Windows");
    }
}

class OSFactory
{
    public OS getInstance(String str)
    {
        if (str.equals("Open"))
            return new Android();
        else if (str.equals("Closed"))
            return new iOS();
        else
            return new Windows();
    }
}

class FactoryDesign
{
    public static void main(String[] args) 
    {
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();    
    }
}