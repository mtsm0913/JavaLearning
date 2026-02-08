class MyException extends Exception {           //Å¶1
}
class Sp {
    void foo() throws Exception {               //Å¶2
        System.out.println("Sp#foo");
    }
}
class Sub extends Sp {
    void foo() throws MyException {             //Å¶3
        System.out.println("Sub#foo");
    }
}
class Sample10_6 {
    public static void main(String[] args) {
        try {
            Sub sb = new Sub();
            sb.foo();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}