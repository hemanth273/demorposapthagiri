package inheritance;

public class Animal {
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Barking...");

    }
}
class  puppy extends Animal{
    void sleep(){
        System.out.println("sleeping...");
    }
}
class Drive {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();


        Dog d = new Dog();
        d.eat();
        d.bark();

        puppy p = new puppy();
        p.eat();
        p.sleep();
    }
}



