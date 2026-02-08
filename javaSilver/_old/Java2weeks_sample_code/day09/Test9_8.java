interface If1 {
    void foo();
}
interface If2 {
    void bar();
}
class S implements If1, If2 {
    public void foo() {
        System.out.print("A");
    }
    public void bar() {
        System.out.print("B");
    }
}
class Test9_8 {
    public static void main(String[] args) {
        If1 i = new S();
        i.foo();
        i.bar();
    }
}