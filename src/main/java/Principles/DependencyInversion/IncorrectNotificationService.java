package Principles.DependencyInversion;

/**
 * Here the NotificationService class is directly depending on EmailService class which
 * is not a good practise because the Notification class is tightly coupled with Email class
 * which makes it messy to add new features like SMS and push notifications. This violates
 * the Dependency Inversion principle
 */
class IncorrectEmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationService {
    private final IncorrectEmailService emailService;

    public NotificationService() {
        this.emailService = new IncorrectEmailService(); // Direct dependency
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}

public class IncorrectNotificationService {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!");
    }
}
