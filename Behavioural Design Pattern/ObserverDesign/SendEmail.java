import java.util.*;

interface Subject
{
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void uploadNewsletter(String newsletter);
}

interface Subscriber
{
    public void update(String newsletter);
} 

class Newsletter implements Subject
{
    private List<Subscriber>subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber)
    {
        subscribers.remove(subscriber);
    }
    public void uploadNewsletter(String newsletter)
    {
        System.out.println("Uploading newsletter: "+newsletter);
        for (Subscriber subscriber : subscribers)
        {
            subscriber.update(newsletter);
        }
    }
}

class NewsletterSubscriber implements Subscriber
{
    private String subscriberName;
    public NewsletterSubscriber(String subscriberName)
    {
        this.subscriberName = subscriberName;
    }
    public void update(String newsletter)
    {
        System.out.println(subscriberName+" recieved newsletter: "+newsletter);
    }
}

class SendEmail
{
    public static void main(String[] args) 
    {
        Newsletter newsletter = new Newsletter();
        NewsletterSubscriber s1 = new NewsletterSubscriber("Heet");
        NewsletterSubscriber s2 = new NewsletterSubscriber("Devanshi");
        NewsletterSubscriber s3 = new NewsletterSubscriber("Maitri");
        NewsletterSubscriber s4 = new NewsletterSubscriber("Meet");

        newsletter.addSubscriber(s1);
        newsletter.addSubscriber(s2);
        newsletter.addSubscriber(s3);
        newsletter.addSubscriber(s4);

        newsletter.uploadNewsletter("February Highlights");

        newsletter.removeSubscriber(s1);

        newsletter.uploadNewsletter("March Highlights");
    }
}