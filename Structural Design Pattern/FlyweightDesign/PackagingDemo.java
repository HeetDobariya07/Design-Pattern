import java.util.HashMap;

interface Package 
{
    void ship();
}

class Box implements Package 
{
    private int length;
    private int width;
    private int height;
    
    public Box(int length, int width, int height) 
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void ship() {
        System.out.println("Shipping a box with dimensions: " + length + "x" + width + "x" + height);
    }
}

// Package Factory
class PackageManager {
    private static final HashMap<String, Package> packageMap = new HashMap<>();

    public static Package getBox(int length, int width, int height) {
        String key = length + "-" + width + "-" + height;
        Package box = packageMap.get(key);

        if (box == null) {
            box = new Box(length, width, height);
            packageMap.put(key, box);
            System.out.println("Creating a new box with dimensions: " + key);
        }
        return box;
    }
}

// Main class to demonstrate the usage
class PackagingDemo {
    private static final int[] lengths = {10, 20, 30};
    private static final int[] widths = {5, 10, 15};
    private static final int[] heights = {5, 10, 15};
    
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            int length = getRandomDimension(lengths);
            int width = getRandomDimension(widths);
            int height = getRandomDimension(heights);
            
            Package box = PackageManager.getBox(length, width, height);
            box.ship();
        }
    }
    
    private static int getRandomDimension(int[] dimensions) {
        return dimensions[(int) (Math.random() * dimensions.length)];
    }
}
