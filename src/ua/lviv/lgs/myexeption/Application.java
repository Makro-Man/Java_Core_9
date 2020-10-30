package ua.lviv.lgs.myexeption;

public class Application {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Methods methods = new Methods(56, 34);
        methods.addition();
        methods.division();
        methods.multiplication();
        methods.subtraction();
    }
}
