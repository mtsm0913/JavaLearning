abstract class A {
    abstract void method();
}
abstract class B extends A {
    abstract void method();
}
final class C extends B {
    void method() {
         System.out.println("A");
    }
}
class Test9_3 {
    public static void main(String[] args) {
        B x = new C();
        x.method();
    }
}