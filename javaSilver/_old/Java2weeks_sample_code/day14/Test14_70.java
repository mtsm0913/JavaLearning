interface If1 {
    void foo();
}
interface If2 extends If1 {
    void bar();
}
class S implements If2 {
    public void foo() {
        System.out.print("A");
    }
    public void bar() {
        System.out.print("B");
    }
}
class Test14_70 {
    public static void main(String[] args) {
        If2 i = new S();
        i.foo();
        i.bar();
    }
}
