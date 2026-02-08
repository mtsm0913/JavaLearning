class Sp {
    void foo() {
        System.out.print("A");
    }
}
class Sub extends Sp {
    void foo() {
        System.out.print("B");
    }
}
class MyClass {
    static void bar(Sp s) {
        s.foo();
    }
}
class Test8_9{
    public static void main(String[] args) {
        MyClass.bar(new Sub());
    }
}
