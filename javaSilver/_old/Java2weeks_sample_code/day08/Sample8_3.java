class Sp {
    void foo() {
        System.out.println("A");
    }
}
class Sub extends Sp {
    void foo() {                                       //Å¶1
        System.out.println("B");
    }
}
class Sample8_3 {
    public static void main(String[] args) {
        Sub s1 = new Sub();	
        s1.foo();                                      //Å¶2
  
        Sp s2 = new Sub();
        s2.foo();                                      //Å¶3

    }
}
