package Packaging;

public class Client 
{
    public static void main(String[] args) 
    {
        System.out.println("For sugar sachette:");
        PackagingFactory sugarSachette = new SugarSachette();
        Material material1 = sugarSachette.createMaterial();
        Item item1 = sugarSachette.createItem();

        material1.displayMaterial();
        material1.displayColour();
        item1.displayItem();

        System.out.println("For chips packet:");
        PackagingFactory chipsPacket = new ChipsPacket();
        Material material2 = chipsPacket.createMaterial();
        Item item2 = chipsPacket.createItem();

        material2.displayMaterial();
        material2.displayColour();
        item2.displayItem();

        System.out.println("For decorative item:");
        PackagingFactory decorativeItem = new DecorativeItem();
        Material material3 = decorativeItem.createMaterial();
        Item item3 = decorativeItem.createItem();

        material3.displayMaterial();
        material3.displayColour();
        item3.displayItem();
    }
}
