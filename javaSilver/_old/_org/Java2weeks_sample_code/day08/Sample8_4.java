class Sp {
    void foo() {
        System.out.println("A");
    }
}
class Sub extends Sp {
    void foo() {
        super.foo();                                //Å¶1
        System.out.println("B");
    }
}
class Sample8_4 {
    public static void main(String[] args) {
        Sp s = new Sub();
        s.foo();                                    //Å¶2
    }
}