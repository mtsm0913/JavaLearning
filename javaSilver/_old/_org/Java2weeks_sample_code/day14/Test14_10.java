class MyClass{
}
class Test14_10 {
    public static MyClass foo() {
        MyClass mc = new MyClass();
        return mc;
    }
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = foo();
        MyClass mc3 = new MyClass();
        foo();
        mc3 = mc1;
        mc3 = null;
    }
}