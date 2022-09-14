package ss7_Abstract_class_interface.practive.interface_comparable_for_class_geometric.test;

import ss7_Abstract_class_interface.practive.interface_comparable_for_class_geometric.camparablecircle.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles= new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"Green",false);
        System.out.println("Pre-sorted:");
        for(ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for(ComparableCircle circle: circles){
            System.out.println(circle);
        }

    }
}
