package Comparision;
interface ClothingItem {
    void displayDetails();
}




// Concrete implementation of T-shirt
class TShirt implements ClothingItem {
    private String brand;
    private String size;
    private String color;
    private String material;




    // Constructor for T-shirt
    public TShirt(String brand, String size, String color, String material) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
    }




    @Override
    public void displayDetails() {
        System.out.println("\nT-Shirt- \n Brand: " + brand + "\n Size: " + size + "\n Color: " + color + "\n Material: " + material);
    }
}




// Concrete implementation of Jeans
class Jeans implements ClothingItem {
    private String brand;
    private String size;
    private String color;
    private String material;




    // Constructor for Jeans
    public Jeans(String brand, String size, String color, String material) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
    }




    @Override
    public void displayDetails() {
        System.out.println("\nJeans- \n Brand: " + brand + "\n Size: " + size + "\n Color: " + color + "\n Material: " + material + "\n");
    }
}




// ClothingFactory responsible for creating different types of clothing items
class ClothingFactory {
    public static ClothingItem createTShirt(String brand, String size, String color, String material) {
        return new TShirt(brand, size, color, material);
    }




    public static ClothingItem createJeans(String brand, String size, String color, String material) {
        return new Jeans(brand, size, color, material);
    }
}




// Example usage of the Factory pattern for creating T-shirts and Jeans
public class Main {
    public static void main(String[] args) {
        // Create a T-shirt using the factory
        ClothingItem tShirt = ClothingFactory.createTShirt("Gucci", "Large", "Blue", "Cotton");
        tShirt.displayDetails();




        // Create Jeans using the factory
        ClothingItem jeans = ClothingFactory.createJeans("Tommy Hilfiger", "Medium", "Black", "Denim");
        jeans.displayDetails();
    }
}
