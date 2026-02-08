class MyClass {
    int x;
    MyClass(int x) {
        this.x = x;
    }
}
class Sample12_1 {
    public static void main(String[] args) {
        MyClass a1 = new MyClass(1);
        MyClass a2 = new MyClass(2);
        MyClass a3 = a2;

        System.out.println(a1.equals(a2));          //Å¶1
        System.out.println(a2.equals(a3));          //Å¶2
    }
}
