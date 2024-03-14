import java.util.*;

public class CarSpecification implements Cloneable
{
    private List<String> carspecs;

    public CarSpecification()
    {
        this.carspecs = new ArrayList<String>();
    }
    public CarSpecification(List<String> list)
    {
        this.carspecs = list;
    }
    public void insertData()
    {
        carspecs.add("V8 Engine");
        carspecs.add("SUV");
        carspecs.add("Bi-Turbo");
        carspecs.add("Quad-Tip Exhaust");
    }
    public void modify(String oldItem, String newItem) 
    {
        int index = carspecs.indexOf(oldItem);
        if (index != -1) 
        {
            carspecs.set(index, newItem);
            System.out.println("Modification successful.");
        } 
        else 
        {
            System.out.println(oldItem + " not found in the clothing list.");
        }
    }

    public List<String> getSpecList()
    {
        return this.carspecs;
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
        for (String s: this.carspecs)
        {
            tempList.add(s);
        }
        return new CarSpecification(tempList);
    }
}


