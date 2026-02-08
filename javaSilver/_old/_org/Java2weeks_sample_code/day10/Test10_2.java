interface If {}
class A implements If {}
class B {}
class Test10_2 {
    public static void main(String[] args) {
        A a = new A();
        If i = a;
        B b = (B)i;
    }
}
