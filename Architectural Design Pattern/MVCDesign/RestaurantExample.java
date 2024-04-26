import java.util.*;

class Cook 
{
    public void prepareFood(String dish) 
    {
        System.out.println("Preparing " + dish + "...");
        System.out.println(dish + " is ready!");
    }
}

class Customer 
{
    public void placeOrder(String dish) 
    {
        System.out.println("Placing order for " + dish);
    }
}

class Waiter 
{
    private Cook cook;
    private Customer customer;

    public Waiter() 
    {
        this.cook = new Cook();
        this.customer = new Customer();
    }

    public void takeOrder(String dish) 
    {
        customer.placeOrder(dish);
        cook.prepareFood(dish);
        System.out.println(dish + " is served!");
    }
}


class RestaurantExample 
{
    public static void main(String[] args) 
    {
        String dish;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dish you want to order: ");
        dish = sc.nextLine();
        Waiter waiter = new Waiter();
        waiter.takeOrder(dish);
    }
}
