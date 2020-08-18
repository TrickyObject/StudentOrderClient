package mts.student.exception;

public class BirthRegException extends Exception {

    private String code;


    public BirthRegException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BirthRegException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
