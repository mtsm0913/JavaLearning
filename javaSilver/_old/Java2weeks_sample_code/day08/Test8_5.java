class A {
    void foo() {
        System.out.print("A");
    }
}
class B extends A {
    void foo(int x) {
        System.out.print("B");
    }
}
class C extends B {
    void foo(int x, double d) {
        System.out.print("C");
    }
}
class Test8_5{
    public static void main(String[] args) {
        A x = new C();
        B y = (C)x;
        y.foo();
    }
}