class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
class Calc {
    private int result;
    public void div(int x, int y) throws MyException {
        if(y != 0) {
            this.result = x / y;
        } else {
            throw new MyException("É[ÉçÇ≈äÑÇËéZÇ≈Ç´Ç‹ÇπÇÒÅB");
        }
    }
    public int getResult() {
        return result;
    }
}
class Test14_34 {
    public static void main(String[] args) {
        int x = 10, y = 0;
        int result = 0;
        Calc calc = new Calc();
        try {
            calc.div(x, y);
            result = calc.getResult();
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch(RuntimeException e) {
            System.out.println("RuntimeException");
        } catch(MyException e) {
            System.out.println("MyException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
        System.out.println("end");
    }
}