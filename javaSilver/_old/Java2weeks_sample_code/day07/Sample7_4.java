class Sample7_4 {
    static void foo() {
        System.out.println("foo()ÅF");
    }
    static void foo(int x) {
        System.out.println("foo(int)ÅF" + x);
    }
    static void foo(int x, int y) {
        System.out.println("foo(int,int)ÅF" + x + "," + y);
    }
    public static void main(String[] args) {
        foo();                                //Å¶1
        foo(10);                              //Å¶2
        foo(10, 20);                          //Å¶3
        // foo(10, 20, 30);                   //Å¶4
    }
}
