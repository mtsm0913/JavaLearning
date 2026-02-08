class Sp {                                    //Å¶1
    void foo() {
        System.out.println("A");
    }
}
class Sub extends Sp {                        //Å¶2
    void bar() {
        System.out.println("B");
    }
}
class Sample8_2 {
    public static void main(String[] args) {
        Sub s1 = new Sub();                   //Å¶3
        s1.foo();                             //Å¶4
        s1.bar();                             //Å¶5

        Sp s2 = new Sub();                    //Å¶6
        s2.foo();                             //Å¶7
        // s2.bar();                          //Å¶8
    }
}