abstract class Sp {
    int x;
    public Sp(int x) {
        this.x = x;
    }
    public abstract void showX();
}
class Sub extends Sp {
    public Sub(int x) {
        super(x);
    }
    public void showX(){ System.out.print(x); }
}
class Test14_75 {
    public static void main(String[] args) {
        Sp s = new Sub(7);
        s.showX();
    }
}
