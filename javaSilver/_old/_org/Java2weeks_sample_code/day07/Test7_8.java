class Test7_8 {
    static void foo(int x) {
        System.out.print("A");
    }
    static void foo(short x) {
        System.out.print("B");
    }
    public static void main(String[] args) {
        byte b = 10;
        foo(b);
    }
}