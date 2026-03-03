package Strings.StringBufferAndBuilder;

public class StringBufferexample {
     static void stringAppend() {
         StringBuffer sbf = new StringBuffer("hello");
         System.out.println("original String is:" + sbf);
         sbf.append("world");
         System.out.println("new String is :" + sbf);
     }

    static void Stringinsert() {
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("original String is:" + sbf);
        sbf.insert(2, "world");
        System.out.println("new String is :" + sbf);
    }
    static void stringReverse() {
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("Original String is: " + sbf);
        sbf.reverse();
        System.out.println("new String is:" + sbf);
    }

  public  static void main(String[] args) {
         stringAppend();
         Stringinsert();
         stringReverse();



    }



    }



