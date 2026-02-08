class MyClass {
    private int x;
    public MyClass(int x) {
        this.x = x;
    }
}
class Test14_65 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(1);
        MyClass m2 = new MyClass(1);
        MyClass m3 = m1;
        System.out.print(m1.equals(m2) + ":" + m2.equals(m3) + ":" + m3.equals(m1));
    }
}
