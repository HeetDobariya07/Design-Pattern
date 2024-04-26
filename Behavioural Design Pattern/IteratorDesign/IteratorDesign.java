interface Iterator
{
    public boolean hasNext();
    public Object next();
}

interface Container
{
    public Iterator getIterator();
}

class NameRepository implements Container
{
    public String names[] = {"Heet", "Devanshi", "Meet", "Maitri"};

    public Iterator getIterator() 
    {
        return new NameIterator();
    }

    class NameIterator implements Iterator 
    {
        int index;

        public boolean hasNext() 
        {
            return index < names.length;
        }

        public Object next() 
        {
            if (this.hasNext()) 
            {
                return names[index++];
            }
            return null;
        }
    }
}

public class IteratorDesign 
{
    public static void main(String[] args) 
    {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) 
        {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}