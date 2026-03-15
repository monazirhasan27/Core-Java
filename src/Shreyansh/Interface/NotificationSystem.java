package Shreyansh.Interface;

/*
✅ Question (as if asked in interview)

Q.Design a Notification system using interfaces where:

1. Every notification service must implement a send() method.
2. There should be a default method inside the interface that prints a generic message like "Notification Sent!" to all implementations (without forcing each class to override).
3. There should also be a static method inside the interface that prints the platform type (for example: "This is a digital notification").
4. Create a class EmailNotification that implements this interface.
4. Inside main, create an object of EmailNotification and call:
    a) the implemented send() method,
    b) the default method from interface,
    c) and the static method using interface name.
 */

interface Notification{
    void send();

    default void message(){
        System.out.println("Notification Sent!");
    }

    static void platform(){
        System.out.println("This is a digital notification");
    }
}

class EmailNotification implements Notification{

      @Override
      public void send(){
          System.out.println("Email sent!");
      }
}

public class NotificationSystem {
    public static void main(String[] args) {

        EmailNotification obj1 = new EmailNotification();
        obj1.send();
        obj1.message();

        Notification.platform();

    }
}
