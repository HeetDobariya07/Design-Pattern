public class AndroidPhone implements Phone
{
    public String finalPhone;
    @Override
    public void builtPhone(String componentsRequired)
    {
        finalPhone = "Android phone with components:" + componentsRequired;
    }

    @Override
    public String deliverPhone()
    {
        return finalPhone;
    }
}
