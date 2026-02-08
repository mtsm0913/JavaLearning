class MyClass {
    static int x;
    int y;
}
class Test14_52 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.x++;
        m1.y++;
        MyClass m2 = new MyClass();
        m2.x++;
        m2.y++;
        System.out.print(m1.x + ":" + m1.y);
    }
}
