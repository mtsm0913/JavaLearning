interface SpIf {                                 //Å¶1
    void foo();
}
interface SubIf extends SpIf {                   //Å¶2
    void bar();
}
class MyClass implements SubIf {                 //Å¶3
    public void foo() {
        System.out.println("foo");
    }
    public void bar() {
        System.out.println("bar");
    }
}
class Sample9_4 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();              //Å¶4
        mc.foo();                                //Å¶5
        mc.bar();                                //Å¶6
    }
}