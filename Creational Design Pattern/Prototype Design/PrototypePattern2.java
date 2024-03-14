import java.util.*;

public class PrototypePattern2 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CarSpecification a = new CarSpecification();
        a.insertData();
        CarSpecification b = (CarSpecification) a.clone1();
        System.out.println("For Shallow Copy: ");
        System.out.println("Original List: "+ a.getSpecList());
        System.out.println("Clone List: "+ b.getSpecList());

        CarSpecification c = (CarSpecification) a.clone2();
        System.out.println("For Deep Copy:");
        System.out.println("Original List: "+a.getSpecList());
        System.out.println("Clone List: "+c.getSpecList());

        List<String> list = c.getSpecList();
        list.add("Mafia SUV");
        System.out.println("Clone list after addition of one element: "+c.getSpecList());
        c.modify("V8 Engine","Roaring V8");
        System.out.println("Clone list after modifying one element: "+c.getSpecList());
        c.getSpecList().remove("SUV");
        System.out.println("Clone list after removing of one element: "+list);
        System.out.println("Original List: "+a.getSpecList());
    }
}
