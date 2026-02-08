class MyClassA {
     int x;
}
class MyClassB {
    int x;
    public String toString() {
        return "[" + x + "]";
    }
}
class Sample12_3 {
    public static void main(String[] args) {
        MyClassA a = new MyClassA();
        a.x = 10;
        MyClassB b = new MyClassB();
        b.x = 20;
        System.out.println(a);          //Å¶1
        System.out.println(b);          //Å¶2
    }
}
