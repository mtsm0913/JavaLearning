class MyClassA{
}
class MyClassB{
    MyClassB(){
    }
}
class Test14_29 {
    public static void main(String[] args){
        MyClassA a = new MyClassA();
        MyClassB b = new MyClassB();
        a = b;
    }
}
