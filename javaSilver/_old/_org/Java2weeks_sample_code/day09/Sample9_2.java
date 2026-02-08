interface MyInterface {                        //Å¶1
    int x = 10;
    void foo();
}
class MyClass implements MyInterface {         //Å¶2
    public void foo() {
        System.out.println(x);
    }
}
class Sample9_2 {
    public static void main(String[] args) {
        MyInterface mi = new MyClass();        //Å¶3
        mi.foo();                              //Å¶4
        System.out.println(MyInterface.x);     //Å¶5
    }
}