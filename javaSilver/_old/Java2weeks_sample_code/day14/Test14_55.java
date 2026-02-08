class Test14_55 {
    static void foo(int x, int y) {
        System.out.print("A");
    }
    static void foo(int... x) {
        System.out.print("B");
    }
    public static void main(String[] args) {
        int x = 1, y = 2;
        foo(x, y + 2);
    }
}
