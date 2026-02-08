class S {
    void foo() {
        System.out.print("S");
    }
}
class A extends S {
    void bar() {
        System.out.print("A");
    }
}
class B extends S {
    public void foo() {
        System.out.print("B");
    }
}
class Test8_10{
    public static void use(S s) {
        s.bar();
    }
    public static void main(String[] args) {
        use(new A());
    }
}
