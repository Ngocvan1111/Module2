package learn.statics;

public class Rectangle extends Shape {
    public static int count =0;
    public static String color = "màu gốc";
    public String colorkhongstatic = " màu gôcss";
    public Rectangle(){
        super();
    }
    public static String changcolor(){
        color = "màu sau khi chuyển";
        return color;
    }
    public String changcolorkhogstatic(String color){
        this.colorkhongstatic = color;
        return this.colorkhongstatic;

    }
}
