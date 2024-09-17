package Principles.DependencyInversion;

/**
 * Here we are separating different kinds of notification providers into separate classes and making
 * the NotificationSender more generic and extensible. This way we loosely coupled the classes and made the code
 * more reusable. This completely follows Dependency Inversion Principle
 */
interface NotificationSender {
    void send(String message);
}

class EmailService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationServiceCorrect {
    private final NotificationSender notificationSender;

    public NotificationServiceCorrect(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}

public class CorrectNotificationService {

}
