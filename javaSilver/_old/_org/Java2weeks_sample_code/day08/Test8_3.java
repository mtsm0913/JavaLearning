class A { }
class B extends A { }
class Test8_3 {
    public static void main(String[] args) {
        A x = new A();
        A y = new B();
        B v = new A();
        B u = new B();
    }
}