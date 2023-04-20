public class MyExeption extends RuntimeException{
    private String Code;

    public MyExeption(String message, String code) {
        super(message);
        Code = code;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
