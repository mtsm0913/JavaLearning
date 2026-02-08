class MyClass {
    MyClass(String x) {
        System.out.print("A");
    }
    MyClass(int x) {
        System.out.print("B");
    }
}
class Test7_3 {
    public static void main(String[] args) {
        int x = 0;
        new MyClass(x);
    }
}
