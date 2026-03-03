package abs.RBI;

abstract class Rbi {
    abstract int ROI();


}
class hdfc extends Rbi {
    int ROI(){
        return 10;

    }
}
class sbi extends Rbi {
    int ROI(){
        return 6;

    }
}
class Drive{
    static void main(String[] args) {
        hdfc h = new hdfc() ;
        sbi s=new sbi();

        System.out.println("hdfc:"+h.hdfc,"%");
        System.out.println("sbi"+s.sbi,"%");

    }

}
