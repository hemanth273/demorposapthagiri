package Expction;

public class E2 {
  public   static void main(String[] args) {
      double i=18, j=3, k=0;
      try{
          k=i/j;
          System.out.println(k);
          double[] arr={1,2,3,4,5};
          System.out.println(arr[20]);

      } catch (ArithmeticException| ArrayIndexOutOfBoundsException e){
          System.out.println(e);
      }

    }
}
