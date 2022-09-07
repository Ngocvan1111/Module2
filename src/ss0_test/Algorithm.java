package ss0_test;

import java.util.Scanner;
// Tổng quát

//public class giai_thuat {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter");
//        int height = Integer.parseInt(scanner.nextLine());
//        for (int i = 1; i<=height;i++){
//            for(int j = 1; j<=height*2-1;j++){
//                if(j==(height+1)-i|| j == (height-1)+i){
//                    if(i-1==0){
//                        System.out.print(" ");
//
//                    }
//                    else{ System.out.print(i-1);
//                }}
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//        for (int i = height-1; i>=1;i--){
//            for(int j = 1; j<=height*2-1;j++){
//                if(j==(height+1)-i|| j == (height-1)+i){
//                    if(i-1==0){
//                        System.out.print(" ");
//
//                    }
//                    else{ System.out.print(i-1);
//                    }}
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//}
public class Algorithm {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 * 2 - 1; j++) {
                if (j == (6 + 1) - i || j == (6 - 1) + i) {
                    if (i - 1 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.printf("%d%s",i - 1," ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 6 - 1; i >= 1; i--) {
            for (int j = 1; j <= 6 * 2 - 1; j++) {
                if (j == (6 + 1) - i || j == (6 - 1) + i) {
                    if (i - 1 == 0) {
                        System.out.print(" ");

                    } else {
                        System.out.printf("%d%s",i - 1," ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
