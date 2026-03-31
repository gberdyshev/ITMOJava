package exceptions;

public class BagException extends Exception {
    public BagException() {}
    public String getMessage() {
        return "Мешок порвался!";
    }
   
}