class MyClass {
    private int x;
    private int y;
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return x + "," + y;
    }
}
class Test14_64 {
    public static void main(String[] args) {
        int x = 3, y = 5;
        MyClass mc = new MyClass(y, x);
        System.out.print(mc);
    }
}
