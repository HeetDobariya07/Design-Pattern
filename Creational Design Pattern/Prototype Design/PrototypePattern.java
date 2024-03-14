import java.util.*;

public class PrototypePattern 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Vehicle a = new Vehicle();
        a.insertData();
        Vehicle b = (Vehicle) a.clone1();
        System.out.println("For Shallow Copy:");
        System.out.println("A: "+a.getVehicleList());
        System.out.println("B: "+b.getVehicleList());

        Vehicle c = (Vehicle) a.clone2();
        System.out.println("For Deep Copy:");
        System.out.println("A: "+a.getVehicleList());
        System.out.println("B: "+c.getVehicleList());

        List<String> list = c.getVehicleList();
        list.add("Porsche Boxter");
        System.out.println("B: "+c.getVehicleList());

        c.getVehicleList().remove("Mercedes G600");
        System.out.println("B: "+list);
        System.out.println("A: "+a.getVehicleList());
        // b.modify();
    }
}

// Deep Copy can copy nested objects also but Shallow Copy will not copy the nested objects.