class MyException extends Exception {
}
class Test10_6 {
    static void foo() {
        throw new MyException();
    }
    public static void main(String[] args) {
        try {
            foo();
            System.out.print("A");
        } catch(Exception e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }
}