class Sp {
    Sp() {
        super();
        System.out.print("A");
    }
}
class Sub extends Sp {
    Sub() {
        System.out.print("B");
    }
    Sub(int x) {
        this();
    }
}
class Test14_7 {
    public static void main(String[] args) {
        long x = 10;
        new Sub((int)x);
    }
}