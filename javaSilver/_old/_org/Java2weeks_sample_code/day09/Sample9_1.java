abstract class Sp {                          //Å¶1
    private int x;
    public Sp(int x) {
        this.x = x;
    }
    abstract void foo();
    public int getX() {
        return x;
    }
}
class Sub extends Sp {                       //Å¶2
    public Sub(int x) {
        super(x);
    }
    void foo() {
        System.out.println(getX());
    }
}
class Sample9_1 {
    public static void main(String[] args) {
        Sp s = new Sub(100);                 //Å¶3
        s.foo();                             //Å¶4
    }
}
