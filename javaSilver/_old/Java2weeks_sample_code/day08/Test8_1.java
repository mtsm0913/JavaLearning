class Sp {
    int x;
}
class Sub extends Sp {
    void bar() {
        System.out.print(x);
    }
}
class Test8_1 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.x = 100;
        sub.bar();
    }
}
