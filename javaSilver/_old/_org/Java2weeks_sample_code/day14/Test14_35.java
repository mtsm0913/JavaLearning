abstract class Sp {
    abstract void foo();
}
class Sub1 extends Sp {
    public void foo() {
        System.out.print("A");
    }
}
class Sub2 extends Sp {
    public void foo() {
        System.out.print("B");
    }
}
class Test14_35 {
    public static void main(Sp s) {
        s.foo();
    }
    public static void main(String[] args) {
        main(new Sub1());
        main(new Sub2());
    }
}
