package OOPs;

public interface Mom {
    void cook();

}
interface Dad{
    void cook();
}
class child implements Mom,Dad{
    public void cook(){
        System.out.println("Indian..!");
    }
}
class river {
    public static void main(String[] args) {
        child d = new child();
        d.cook();
    }
}