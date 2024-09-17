package Principles.SingleResponsibility;

/**
 * In this way we can make sure that each class has only 1
 * responsibility and reduce the errors that may arise in future
 * .............
 * .............
 * This class manages the user validation.
 * */
class UserValidator {
    public void validateUser() {}
}

/**
 * This class manages email notifications
 * */
class EmailSender {
    public void sendEmail() {}
}

/**
 * This class manages the user creation and authentication user.
 * */
public class CorrectUserManager {
    public void createUser() {}
}
