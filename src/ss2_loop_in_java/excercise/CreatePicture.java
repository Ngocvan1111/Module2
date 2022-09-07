package ss2_loop_in_java.excercise;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class CreatePicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which type of shapes do you want to create: \n1. Print the rectangle.\n2. Print the square triangle.\n3. Print isosceles triangle. ");
        int select = Integer.parseInt(scanner.nextLine());
        switch (select){
            case 1:
                System.out.print("Enter width: ");
                int width = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter height: ");
                int height = Integer.parseInt(scanner.nextLine());
                for(int i = 1; i<=height;i++){
                    for(int j = 1; j <= width; j++){
                        System.out.print("* ");
                    }
                    System.out.print('\n');
                }
                break;
            case 2:
                System.out.print("Enter height: ");
                height = Integer.parseInt(scanner.nextLine());
                for(int i =1; i<=height;i++){
                    for(int j=1; j<= i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println('\n');
                for(int i = 1; i<=height;i++){
                    for(int j =1;j<=height;j++){
                        if(j<=(height+1)-i){
                            System.out.print("* ");
                        }

                    }
                    System.out.println();
                }
                for(int i = 1; i<=height;i++){
                    for(int j =1;j<=height;j++){
                        if(j>=i){
                            System.out.print("* ");
                        }
                        else {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }
                for(int i = 1; i<=height;i++){
                    for(int j =1;j<=height;j++){
                        if(j>=height-i){
                            System.out.print("* ");
                        }
                        else {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Enter height: ");
                height = Integer.parseInt(scanner.nextLine());
                for(int i = 1; i<=height;i++){
                    for(int j =1;j<=height*2-1;j++){
                        if(j<=((height+1)-i)||j>=((height-1)+i)){
                            System.out.print("  ");
                        }
                        else {
                            System.out.print("* ");
                        }

                    }
                    System.out.println();
                }
                break;


        }
    }
}
