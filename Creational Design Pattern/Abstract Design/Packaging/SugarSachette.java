package Packaging;

class SugarSachette implements PackagingFactory
{
    @Override
    public Material createMaterial()
    {
        return new Paper();
    }
    @Override
    public Item createItem()
    {
        return new PowderedSugar();
    }
}