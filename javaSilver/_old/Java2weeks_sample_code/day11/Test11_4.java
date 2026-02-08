class MyClass { }
class Test11_4 {
    static MyClass foo() {
        MyClass mc = new MyClass();
        return mc;
    }
    public static void main(String[] args) {
        MyClass mc1;
        mc1 = foo();
    }
}