class MyClass {
    void foo(short x) {
        System.out.println("foo(short)");
    }
    void foo(float x) {
        System.out.println("foo(float)");
    }
}
class Sample7_6 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        byte b = 10;
        mc.foo(b);                                      //Å¶1
        int i = 20;
        mc.foo(i);                                      //Å¶2
        double d = 10.5;
        // mc.foo(d);                                   //Å¶3
    }
}
