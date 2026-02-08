interface I {
    int x = 10;
}
class C {
    void foo() {
        System.out.print("A");
    }
}
class Test9_14 extends C implements I {
    public static void main(String[] args) {
        Test9_14 t = new Test9_14();
        t.foo();
        System.out.print(Test9_14.x);
    }
}