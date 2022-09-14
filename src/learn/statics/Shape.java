package learn.statics;

public class Shape {
    public static int count = 0;
    public Shape(){
        count++;
    }
    public static int change(){
        return 10;
    }
}
