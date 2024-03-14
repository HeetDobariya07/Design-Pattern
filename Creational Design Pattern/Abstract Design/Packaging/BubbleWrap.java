package Packaging;

class BubbleWrap implements Material
{
    @Override
    public void displayMaterial()
    {
        System.out.println("Bubble Wrap: Can be used for fragile items.");
    }
    @Override
    public void displayColour()
    {
        System.out.println("Transparent in colour.s");
    }
}