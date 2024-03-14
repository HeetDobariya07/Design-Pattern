package Comparision;

// Prototype interface for clothing items
interface ClothingPrototype {
    ClothingPrototype clone();
    void displayDetails();
}

// Concrete implementation of T-shirt prototype
class TShirtPrototype implements ClothingPrototype {
    private String brand;
    private String size;
    private String color;
    private String material;

    // Constructor for T-shirt prototype
    public TShirtPrototype(String brand, String size, String color, String material) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    @Override
    public ClothingPrototype clone() {
        return new TShirtPrototype(brand, size, color, material);
    }

    @Override
    public void displayDetails() {
        System.out.println("T-Shirt - Brand: " + brand + ", Size: " + size + ", Color: " + color + ", Material: " + material);
    }
}

// Concrete implementation of Jeans prototype
class JeansPrototype implements ClothingPrototype {
    private String brand;
    private String size;
    private String color;
    private String material;

    // Constructor for Jeans prototype
    public JeansPrototype(String brand, String size, String color, String material) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    @Override
    public ClothingPrototype clone() {
        return new JeansPrototype(brand, size, color, material);
    }

    @Override
    public void displayDetails() {
        System.out.println("Jeans - Brand: " + brand + ", Size: " + size + ", Color: " + color + ", Material: " + material);
    }
}

// Example usage of the Prototype pattern for creating T-shirts and Jeans
public class Outfit {
    public static void main(String[] args) {
        // Create T-shirt prototype
        ClothingPrototype tShirtPrototype = new TShirtPrototype("XYZ Brand", "Large", "Blue", "Cotton");

        // Clone T-shirt prototype to create a new instance
        ClothingPrototype newTShirt = tShirtPrototype.clone();
        newTShirt.displayDetails();

        // Create Jeans prototype
        ClothingPrototype jeansPrototype = new JeansPrototype("ABC Brand", "Medium", "Black", "Denim");

        // Clone Jeans prototype to create a new instance
        ClothingPrototype newJeans = jeansPrototype.clone();
        newJeans.displayDetails();
    }
}
