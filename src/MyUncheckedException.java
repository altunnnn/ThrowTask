public class MyUncheckedException extends RuntimeException{
    private final Integer getCode;
    private final String getMessage;

    public MyUncheckedException(Integer getCode, String getMessage) {
        this.getCode = getCode;
        this.getMessage = getMessage;
    }

    public Integer getGetCode() {
        return getCode;
    }

    public String getGetMessage() {
        return getMessage;
    }
}
