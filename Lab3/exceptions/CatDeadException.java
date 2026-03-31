package exceptions;

public class CatDeadException extends RuntimeException {
    public CatDeadException() {}

    public String getMessage() {
        return "Доигрался... Кот умер";
    }



}