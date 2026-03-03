package method;
//class
public class Student {
   private String name;
  private int usn;
  static String college;

//constructor;

    Student(String name, int usn ){
        this.name=name;
        usn=1;
        college="sapthagiri";


    }
    String getname(){
      return name;

    }
    int getusn(){
      return usn;


    }
    void printdetails(){
        System.out.println(" Student name is; "+ name);
        System.out.println(" Student usn is; "+ usn);
        System.out.println("student college is;"+ college);
    }

}
//main function
class Driver {
    static void main(String[] args) {
        Student s1= new Student(" hemanth ",403);
        Student s2= new Student(" gh ",121);
        s1.printdetails() ;
        s2.printdetails();
    }
}
