package ss15_exception_handling_amp_debug.excercise;

import java.util.Scanner;

public class UseClassILLegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;


        while (true) {

            try {
                System.out.println("Nhập vào cạnh thứ 1: ");
                side1 = Double.parseDouble(scanner.nextLine());
                checkCondition(side1);
                break;
            } catch (IllegaltriangleException e) {
                e.printStackTrace();
            }

        }
        while (true) {

            try {
                System.out.println("Nhập vào cạnh thứ 2: ");
                side2 = Double.parseDouble(scanner.nextLine());
                checkCondition(side2);
                break;
            } catch (IllegaltriangleException e) {
                e.printStackTrace();
            }

        }
        while (true) {

            try {
                System.out.println("Nhập vào cạnh thứ 3: ");
                side3 = Double.parseDouble(scanner.nextLine());
                checkCondition(side3);
                checkCondition(side1,side2,side3);
                break;
            } catch (IllegaltriangleException e) {
                e.printStackTrace();
            }

        }
        System.out.print("3 cạnh của tam giác là: a = " + side1 + ", b = " + side2 + ", c = " + side3);
    }


    public static void checkCondition ( double side) throws IllegaltriangleException{
        if(side<0 ){
            throw new IllegaltriangleException("Độ dài cạnh nhập vào nhỏ hơn 0!!!"+side);
        }

    }
    public static void checkCondition (double side1, double side2, double side3) throws IllegaltriangleException{
        if((side1+side2)<side3||(side2+side3)<side1||(side1+side3)<side2){
            throw new IllegaltriangleException("Tổng 2 cạnh nhập vào nhỏ hơn cạnh thứ 3!!!");
        }
    }

}
