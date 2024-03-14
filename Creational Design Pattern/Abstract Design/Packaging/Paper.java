package Packaging;

class Paper implements Material
{
    @Override
    public void displayMaterial()
    {
        System.out.println("Paper Material: It is easy to recycle.");
    }
    @Override
    public void displayColour()
    {
        System.out.println("White Colour is the colour of paper");
    }
}