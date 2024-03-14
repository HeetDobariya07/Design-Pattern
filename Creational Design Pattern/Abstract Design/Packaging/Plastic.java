package Packaging;

class Plastic implements Material
{
    @Override
    public void displayMaterial()
    {
        System.out.println("Plastic Material: Can be used where durability is needed.");
    }
    @Override
    public void displayColour()
    {
        System.out.println("Green in Colour");
    }
}
