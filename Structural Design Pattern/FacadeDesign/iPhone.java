public class iPhone implements Phone
{
    public String finalPhone;
    @Override
    public void builtPhone(String componentsRequired)
    {
        finalPhone = "Apple phone with components:" + componentsRequired;
    }

    @Override
    public String deliverPhone()
    {
        return finalPhone;
    }
}
