class Sp {
    void foo() {
        System.out.print("A");
    }
}
class Sub extends Sp {
    void foo() {
        System.out.print("B");
    }
}
class Test14_53 {
    public static void main(String[] args) {
        Sp s = new Sub();
        s.foo();
    }
}
