public class TestClass 
{
    public static void main(String[] args) 
    {
        // Get the Singleton instance
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.set(5);
        s2.set(10);
        System.out.println(s1.get());
        s2.i = s1.i + s2.i;
        System.out.println(s2.get());
        print("S1",s1);
        print("S2",s2);
    }

    static void print(String name, Singleton obj)
    {
        System.out.println(String.format("Object: %s, Hashcode: %d", name, obj.hashCode()));
    }
}
