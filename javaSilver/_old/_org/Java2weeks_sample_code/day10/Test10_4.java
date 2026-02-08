class Test10_4 {
    public static void main(String[] args) {
        int a = 1, b = 0;
        int c = 0;
        try{
            c = a / b;
            System.out.println("A");
        } catch(ArithmeticException e) {
            System.out.println("B");
        }
        System.out.println("C");
    }
}