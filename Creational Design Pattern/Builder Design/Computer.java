public class Computer {
    // Compulsory Parameters
    private String HDD;
    private String RAM;
    // Optional Parameters
    private boolean IsGraphicsCardEnabled;
    private boolean IsBluetoothEnabled;

    //Getter Methods
    public String getHDD()
    {
        return this.HDD;
    }
    public String getRAM()
    {
        return this.RAM;
    }
    public boolean getGraphics()
    {
        return this.IsGraphicsCardEnabled;
    }
    public boolean getBluetooth()
    {
        return this.IsBluetoothEnabled;
    }

    //Constructors
    public Computer( String hdd, String ram)
    {
        this.HDD = hdd;
        this.RAM = ram;
    }

    //Setter Methods
    public void setGraphics( boolean graphics)
    {
        this.IsGraphicsCardEnabled = graphics;
    }
    public void setBluetooth( boolean Blue)
    {
        this.IsBluetoothEnabled = Blue;
    }
}

class ComputerMain{
    public static void main(String[] args) {
        Computer C1 = new Computer("1TB", "16GB");
        System.out.println("HDD: " + C1.getHDD());
        System.out.println("RAM: " + C1.getRAM());
        System.out.println("Is Graphics Enabled: " + C1.getGraphics());
        System.out.println("Is Bluetooth Enabled: " + C1.getBluetooth());

        C1.setBluetooth(true);
        C1.setGraphics(true);
        
        System.out.println("Graphics: " + C1.getGraphics());
        System.out.println("Bluetooth: " + C1.getBluetooth());
    }
}

