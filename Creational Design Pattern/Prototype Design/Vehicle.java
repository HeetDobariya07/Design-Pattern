import java.util.*;

public class Vehicle implements Cloneable
{
    private List<String> vehiclelist;

    public Vehicle()
    {
        this.vehiclelist = new ArrayList<String>();
    }
    public Vehicle(List<String> list)
    {
        this.vehiclelist = list;
    }
    public void insertData()
    {
        vehiclelist.add("Mercedes AMG G63");
        vehiclelist.add("Land Rover Defender");
        vehiclelist.add("Mercedes G600");
        vehiclelist.add("Cadillac Escalade V");
        vehiclelist.add("Volkswagen Virtus");
    }
    public List<String> getVehicleList()
    {
        return this.vehiclelist;
    }

    // Shallow Copy
    public Object clone1() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    // Deep Copy
    public Object clone2() throws CloneNotSupportedException
    {
        List<String> tempList = new ArrayList<String>();
        for (String s: this.vehiclelist)
        {
            tempList.add(s);
        }
        return new Vehicle(tempList);
    }
}