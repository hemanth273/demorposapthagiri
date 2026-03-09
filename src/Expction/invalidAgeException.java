package Expction;

public class invalidAgeException extends RuntimeException{
    invalidAgeException(String msg){//constructor
        super(msg);
    }
}
 class Driver{
    static void cheackTime(double time){
        if (time>8.00){
            throw new invalidAgeException("You are late");
            //throwing a new custem excption
        }
        System.out.println("you are on time");

    }
    public static void main(String[] argsr) {
        cheackTime(8.00
        );

    }
 }