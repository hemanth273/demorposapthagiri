package garbagecollector;

import Demoongarbagecollection.Demo;

public class finalize {
    public void Demo()
{
    System.out.println("Garbage Collection");
}
    public static void main(String[] args)
    {
        for (int i = 0; i <10; i++){
            Demo obj = new Demo();
            obj =null;
        }
        System.gc(); // Cll Garbage Collection
    }
}
