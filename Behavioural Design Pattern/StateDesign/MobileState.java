interface MobileAlertState
{
    public void alert();
}

class Ringing implements MobileAlertState
{
    public void alert()
    {
        System.out.println("Phone is in Ringing Mode.");
    }

}
class Silent implements MobileAlertState
{
    public void alert()
    {
        System.out.println("Phone is in Silent Mode.");
    }
}
class Vibrate implements MobileAlertState
{
    public void alert()
    {
        System.out.println("Phone is in Vibrate Mode.");
    }
}

class MobileContext
{
    private MobileAlertState currentState;
    public MobileContext()
    {
        currentState = new Ringing();
    }
    public void setState(MobileAlertState state)
    {
        currentState = state;
    }
    public void alert()
    {
        currentState.alert();
    }
}

class MobileState
{
    public static void main(String[] args) 
    {
        MobileContext mc = new MobileContext();
        mc.alert();
        mc.setState(new Vibrate());
        mc.alert();
        mc.setState(new Silent());
        mc.alert();
    }
}