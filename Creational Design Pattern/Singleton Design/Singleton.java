// Lazy Initialization
public class Singleton 
{
    // private static Singleton soleInstance = new Singleton();
    private static Singleton soleInstance;
    public int i;
    private Singleton()   // private constructor
    {
        System.out.println("Created...");
    } 
    public static Singleton getInstance()  // global access point
    {
        if(soleInstance == null)
        {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }
    public int get()
    {
        return i;
    }
    public static void setSoleInstance(Singleton soleInstance)
    {
        Singleton.soleInstance = soleInstance;
    }
    public void set(int i)
    {
        this.i = i;
    }
}

// Eager Initialization
// public class Singleton 
// {
//     // Private static instance variable
//     private static Singleton soleInstance = new Singleton();
//     public int i;
//     // Private constructor to prevent instantiation from outside the class
//     private Singleton()  
//     {
//         // Initialize the Singleton instance
//         System.out.println("Created...");
//     } 
//     // Public method to provide global access to the instance
//     public static Singleton getInstance()  
//     {
//         return soleInstance;
//     }
//     public int get()
//     {
//         return i;
//     }
//     public static void setSoleInstance(Singleton soleInstance)
//     {
//         Singleton.soleInstance = soleInstance;
//     }
//     public void set(int i)
//     {
//         this.i = i;
//     }
// }
