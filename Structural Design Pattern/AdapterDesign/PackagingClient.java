interface PackagingInterface 
{
    void pack(String itemType, String itemName);
}


class BookPackaging implements PackagingInterface 
{
    @Override
    public void pack(String itemType, String itemName) 
    {
        System.out.println("Packaging " + itemType + ": " + itemName);
    }
}

class ToyPackaging implements PackagingInterface 
{
    @Override
    public void pack(String itemType, String itemName) 
    {
        System.out.println("Packaging " + itemType + ": " + itemName);
    }
}

class PackagingAdapter implements PackagingInterface
{
    BookPackaging bookPackaging;
    ToyPackaging toyPackaging;

    public PackagingAdapter(String itemType) 
    {
        if (itemType.equalsIgnoreCase("book")) 
        {
            bookPackaging = new BookPackaging();
        } else if (itemType.equalsIgnoreCase("toy")) 
        {
            toyPackaging = new ToyPackaging();
        }
    }

    public void pack(String itemType, String itemName) 
    {
        if (itemType.equalsIgnoreCase("book")) 
        {
            bookPackaging.pack(itemType, itemName);
        } else if (itemType.equalsIgnoreCase("toy")) 
        {
            toyPackaging.pack(itemType, itemName);
        }
    }
}

public class PackagingClient 
{
    public static void main(String[] args) 
    {
        PackagingAdapter packagingInterface = new PackagingAdapter("book");
        packagingInterface.pack("book", "The Great Gatsby");

        packagingInterface = new PackagingAdapter("toy");
        packagingInterface.pack("toy", "LEGO Set");
    }
}
