package mts.student.exception;

public class MarriageRegisterException extends Exception {

    private String code;


    public MarriageRegisterException(String code, String message) {
        super(message);
        this.code = code;
    }

    public MarriageRegisterException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
