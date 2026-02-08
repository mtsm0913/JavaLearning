class T {
    public void foo() {
        System.out.print("A");
    }
}
class S extends T {
    public void foo() {
        System.out.print("B");
    }
}
class Test14_77 extends S {
    public void bar() {
        super.foo();
        this.foo();
    }
    public void foo() {
        System.out.print("C");
    }
    public static void main(String[] args) {
        Test14_77 t = new Test14_77();
        t.bar();
    }
}
