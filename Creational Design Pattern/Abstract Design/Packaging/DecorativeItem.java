package Packaging;

class DecorativeItem implements PackagingFactory
{
    @Override
    public Material createMaterial()
    {
        return new BubbleWrap();
    }
    @Override
    public Item createItem()
    {
        return new Vase();
    }
}
