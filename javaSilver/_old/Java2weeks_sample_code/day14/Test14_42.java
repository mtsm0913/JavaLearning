class MyClass {
    private int x;
    public int get() {
        return x;
    }
}
class Test14_42 {
    public static void main(String[] args) {
        MyClass x;
        x = new MyClass();
        x.x++;
        System.out.print(x.get());
    }
}
