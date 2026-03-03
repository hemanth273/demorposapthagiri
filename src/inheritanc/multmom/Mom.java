package inheritanc.multmom;

 class Mom {
     void cook(){
         System.out.println("cookingg...");
     }

}
class Dad {
     void sleep(){
         System.out.println("slepinggg...");

    }
}
class chilg extends Mom{
     void play(){
         System.out.println("playinggg...");
     }
}
class Drive{// only run in class drive other wise itd not work in java
    public static void main(String[] args) {
        Mom m=new Mom();
        m.cook() ;



    }
}

