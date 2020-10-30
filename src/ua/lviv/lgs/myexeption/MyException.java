package ua.lviv.lgs.myexeption;

public class MyException extends Exception {
    private String result;

    public MyException(String result) {
        super(result);
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
