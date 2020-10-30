package ua.lviv.lgs.myexeption;

public class Methods {
    private int a;
    private int b;

    Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void addition() throws MyException, IllegalAccessException {
        conditions();
        double result = a + b;
        System.out.println(result);
    }

    public void subtraction() throws MyException, IllegalAccessException {
        conditions();
        double result = a - b;
        System.out.println(result);
    }

    public void multiplication() throws MyException, IllegalAccessException {
        conditions();
        double result = a * b;
        System.out.println(result);
    }

    public void division() throws MyException, IllegalAccessException {
        conditions();
        double result = a / b;
        System.out.println(result);
    }

    public void conditions() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a < 0 and b < 0");
        }
        if ((this.a == 0 && this.b != 0) || (this.a != 0 && this.b == 0)) {
            throw new ArithmeticException("A or B is not 0");
        }
        if (this.a == 0 && this.b == 0) {
            throw new IllegalAccessException("A and B equal 0");
        }
        if (this.a > 0 && this.b > 0) {
            String sos = ("Wrong");
            throw new MyException(sos);
        }
    }
}
