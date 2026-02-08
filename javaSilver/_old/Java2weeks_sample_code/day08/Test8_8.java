class Sp {
    void foo() {
        System.out.print("A");
    }
    public void bar() {
        System.out.print("B");
    }
}
class Sub extends Sp {
    public void foo() {
        System.out.print("C");
    }
}
class Test8_8{
    public static void main(String[] args) {
        Sp s = new Sub();
        s.foo();
        s.bar();
    }
}
