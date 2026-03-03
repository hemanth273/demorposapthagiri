package string;

public class Strings {
    public static void main() {
        String s1 ="java p[rogramming";
        String s2 = new String("java programming");
        System.out.println("original string" + s1);

         //length
        System.out.println("length:" + s1);
        //character
        System.out.println("character:"+s1);
        //toupper//lower
        System.out.println("uppercase:"+s1.toUpperCase());
        System.out.println("lowercase:"+s1.toLowerCase());
        System.out.println("using ==" + (s1==s2));
        System.out.println("using equals(): " + s1.equals(s2));
        //compare
        System.out.println("coputerTo():"+ s1.compareTo(s2));
        //subtracting
        System.out.println("Subtracting 0 to 4:" + s1.substring(0,4) );
        //contain()
        System.out.println("Contains  'program':"+ s1.contains("program"));
        //indexof()
        System.out.println("index of 'a':" + s1.indexOf('a'));
        //replace
        System.out.println("replace java to python:"+ s1.replace("Java", "Python"));
        //trip()
        String s3=" hello world";
        System.out.println("before trim :"+s3);
        System.out.println("after trim:"+s3.trim());
        //contact
        System.out.println("contact:"+s1.concat("Language"));
        //is emty
        String s4="";
        System.out.println("is empty:" +s4.isEmpty());
        //split
        String sentence ="java is a proggrammig language";
        String [] arr=sentence.split(" ");
        for (String i :arr) {
            System.out.println(i);

        }


    }
}
