interface PhoneBuilder 
{
    PhoneBuilder setOS(String os);
    PhoneBuilder setRam(int ram);
    PhoneBuilder setProcessor(String processor);
    PhoneBuilder setScreensize(double screensize);
    PhoneBuilder setBattery(int battery);
    Phone getPhone();
}

