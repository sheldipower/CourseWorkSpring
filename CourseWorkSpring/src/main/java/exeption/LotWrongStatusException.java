package exeption;

public class LotWrongStatusException extends RuntimeException{

    public LotWrongStatusException(String message) {
        super(message);
    }
}
