interface MyInterface1 {                                   //Å¶1
    void foo();
    void piyo();
}
interface MyInterface2 {                                   //Å¶2
    void bar();
    void piyo();
}
class MyClass implements MyInterface1, MyInterface2 {      //Å¶3
    public void foo() {
        System.out.println("foo");
    }
    public void bar() {
        System.out.println("bar");
    }
    public void piyo() {
        System.out.println("piyo");
    }
}
class Sample9_3 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();                         //Å¶4
        mc.foo();                                           //Å¶5
        mc.bar();
        mc.piyo();
    }
}