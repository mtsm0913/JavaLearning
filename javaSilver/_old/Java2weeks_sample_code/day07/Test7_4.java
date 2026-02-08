class MyClass {
    MyClass(int x, int y) {
        System.out.print(x + y);
    }
    void MyClass(int x, int y) {
        System.out.print(x * y);
    }
}
class Test7_4 {
    public static void main(String[] args) {
        int a = 2, b = 5;
        new MyClass(a, b);
    }
}

