package inheitance.muli.Usingconstrction;

public class Usingconstraction{
    String FirstName;
    String LastName;

    Usingconstraction (String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
}

class Student extends Usingconstraction {
    int usn;

    Student(String FirstName, String LastName, int usn) {
        super(FirstName, LastName);
        this.usn = usn;
    }

    void printDetails() {
        System.out.println("+ FirstName");
        System.out.println("+ LastName");
        System.out.println("+ usn");
    }
}


class Drive{
  public   static void main(String[] args ) {
      Student s2=new Student( "bcv","123",00);

    }
}
