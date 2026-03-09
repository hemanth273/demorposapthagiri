package Expction;

public class E1 {
    public static void main(String[] args) {
        int i = 10, j = 0, k = 0;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[20]);}
        catch (ArithmeticException e) {
            System.out.println("you can't divide anything by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        } catch (Exception e) {

            System.out.println("unkown Exception");
        } finally {
            System.out.println("this block will get execution");

        }
        System.out.println("hello");
    }
}
