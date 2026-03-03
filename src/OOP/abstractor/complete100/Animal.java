package OOP.abstractor.complete100;

public interface  Animal {
    void eat();
    void run();

}
class Dog implements Animal {
    public void eat() {
        System.out.println("eating,,,,!");
    }
    public void run(){
        System.out.println("running...!");
    }
}
class Driver{
   public static void main(String[] args) {
        Dog d=new Dog();
        d.eat ();
        d.run();

    }
}