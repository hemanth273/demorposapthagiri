package abstrac.partial;

abstract public class Animal {
 abstract  void eat();

}
class lion extends Animal {
    void eat(){
        System.out.println("meat.......!");
    }
}
class Deer extends  Animal {
    void eat(){
        System.out.println("grasss....!");
    }

}
class Drive{
    static void main(String[] args) {
        lion l= new lion();
        Deer d=new Deer();

        l.eat();
        d.eat();

    }
}