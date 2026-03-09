package Expction;

public class E4 {
    public static void main(String[] args){
        try{
            int balence =3000;
            int withdraw =3000;
            if (withdraw >balence){
                throw new ArithmeticException("Insufficient bank balence...!");
            }
            System.out.println("withdrew Successful");
        } catch (ArithmeticException e){
            System.out.println("Exception caught:" + e.getMessage());
        }
    }
}
