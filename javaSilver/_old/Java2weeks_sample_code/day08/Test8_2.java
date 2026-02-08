class Sp {
    int x;
    Sp(int x) {
        this.x = x;
    }
}
class Sub extends Sp {
    int y;
    void foo() {
        System.out.print(x + y);
    }
}
class Test8_2 {
    public static void main(String[] args) {
        Sub sub = new Sub(5);
        sub.y = 7;
        sub.foo();
    }
}
