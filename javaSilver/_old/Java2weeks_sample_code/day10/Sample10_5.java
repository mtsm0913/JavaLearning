class MyException extends Exception {                              //Å¶1
}
class Sample10_5 {
    static void foo() throws MyException {                         //Å¶2
        System.out.println("foo");
        throw new MyException();
    }
    public static void main(String[] args) {
        try {
            foo();                                                 //Å¶3
        } catch(MyException e) {                                   //Å¶4
            System.out.println("ó·äOMyExceptionÇ™î≠ê∂ÇµÇ‹ÇµÇΩÅB");
          } finally {                                              //Å¶5
            System.out.println("finally");
        }
        System.out.println("end");
    }
  }