interface If {
    void foo();
}
class S implements If {
    public void foo() {
        System.out.print("A");
    }
}
class Test9_7 {
    public static void main(String[] args) {
        If i = new S();
        i.foo();
    }
}
