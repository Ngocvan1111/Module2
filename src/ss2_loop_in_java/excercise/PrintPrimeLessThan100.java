package ss2_loop_in_java.excercise;

public class PrintPrimeLessThan100 {
    public static void main(String[] args) {
        for(int i =2;i<100;i++){
            int check =0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    check++;
                }
            }
            if(check ==2){
                System.out.println(i);
            }
        }
    }
}
