package ss6_inheritance.excercise.ClassPointandMoveablePoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(9,10);
        System.out.println(Arrays.toString(point.getXY()) );
        MoveablePoint moveablePoint =  new  MoveablePoint(point.getX(),point.getY(),11.0f,12.0f);
        System.out.println(Arrays.toString(moveablePoint.move()));
        System.out.println(moveablePoint);
    }
}
