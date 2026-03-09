package Expction;

public class E3 {
    public static void cheackAge(int age) {

        if (age >=18){
            System.out.println("Access Granted");
        }
        else {
            throw new RuntimeException("Access Denied!..");
        }

    }
    public static void main(String[] args) {
        //cheack age(15);
        cheackAge(20);


    }
}
