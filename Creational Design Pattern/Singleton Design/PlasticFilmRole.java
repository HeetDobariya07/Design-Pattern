public class PlasticFilmRole 
{
    private static PlasticFilmRole instance;

    private PlasticFilmRole() 
    {
        System.out.println("Plastic Film Role instance created.");
    }

    
    public static PlasticFilmRole getInstance() 
    {
        // Lazy initialization: create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new PlasticFilmRole();
        }
        return instance;
    }

    // Method to wrap an object with plastic film
    public void wrapObject(String objectName) 
    {
        System.out.println("Wrapping " + objectName + " with plastic film.");
    }

    public static void main(String[] args) 
    {
        // Get the PlasticFilmRole instance
        PlasticFilmRole plasticFilmRole = PlasticFilmRole.getInstance();

        // Wrap different objects using the same instance
        plasticFilmRole.wrapObject("Book");
        plasticFilmRole.wrapObject("Gift");
        plasticFilmRole.wrapObject("Electronics");
    }
}
