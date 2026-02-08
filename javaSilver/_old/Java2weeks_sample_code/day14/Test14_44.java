class T {
    int x;
    public T(int x) {
        this.x = x;
    }
    void printX() {
        x *= 2;
        System.out.print(x);
    }
}
class S extends T {
    int x;
    public S(int x) {
        this.x = x;
    }
    public void printX() {
        System.out.print(x);
    }
}
class Test14_44 {
    public static void main(String[] args) {
        int x = 10;
        T t = new S(x);
        t.printX();
    }
}