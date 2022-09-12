package ss0_1_test;
import ss0_test.Parent;
 class Child extends Parent {
  public void test(){
      System.out.println("x is: = "+x);

  }

     public static void main(String[] args) {
         Child child = new Child();
         child.test();
     }
}
