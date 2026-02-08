interface If1 {
    public void foo();
}
interface If2 {
    void bar();
}
class S implements If1, If2 {
    public void foo(){ System.out.print("A"); }
    void bar() { System.out.print("B"); }
}
class Test14_49 {
    public static void main(String[] args) {
        If1 i1 = new S();
        i1.foo();
        If2 i2 = new S();
        i2.bar();
    }
}
