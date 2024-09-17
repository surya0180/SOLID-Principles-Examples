package Principles.SingleResponsibility;

/**
 * Having functions that do not align with the primary purpose of this class
 * increases the risk of errors when changes are made to other functions.
 * The best approach is to split the class into multiple classes,
 * each with a single responsibility.
 * */
public class IncorrectUserManager {
    public void createUser() {}
    public void validateUser() {}
    public void sendEmail() {}
}
