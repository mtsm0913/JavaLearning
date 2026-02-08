class Sample10_4 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);                      //※1
        } catch(ArithmeticException e) {                    //※2
            System.out.println("ゼロ除算が行われました。");
        } catch(Exception e) {                              //※3
            System.out.println("例外が発生しました。");
        } finally {                                         //※4
            System.out.println("finally");
        }
        System.out.println("end");
    }
}