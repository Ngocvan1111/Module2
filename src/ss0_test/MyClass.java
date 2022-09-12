package ss0_test;

public class MyClass {
    int[] x;

    void method(int[] x) {
        this.x = x;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
