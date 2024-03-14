package Packaging;

class ChipsPacket implements PackagingFactory
{
    @Override
    public Material createMaterial()
    {
        return new Plastic();
    }
    @Override
    public Item createItem()
    {
        return new Wafers();
    }
}
