interface I {
    void foo();
}
abstract class T implements I {
    void bar();
}
class S extends T {
    public void foo() { System.out.print("A"); }
    public void bar() { System.out.print("B"); } 
}
class Test9_10{
    public static void main(String[] args) {
        S s = new S();
        s.foo();
        s.bar();
    }
}