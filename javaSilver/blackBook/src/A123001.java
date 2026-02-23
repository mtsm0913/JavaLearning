class A {
    public A() {
        System.out.print("A");
    }
}

class B extends A {
    public B() {
        System.out.print("B");
    }
}

class C extends B {
    public C() {
        System.out.print("C");
    }
}

public class A123001 {
    public static void main(String[] args) {
        new C();
    }
}
