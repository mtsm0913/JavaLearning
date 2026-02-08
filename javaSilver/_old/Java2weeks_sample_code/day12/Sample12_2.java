class MyClass {
    int x;
    MyClass(int x) {
        this.x = x;
    }
    public boolean equals(Object obj) {             //Å¶1
        if((obj instanceof MyClass) && ((MyClass)obj).x == this.x) {
            return true;
        } else {
            return false;
        }
    }
}
class Sample12_2 {
    public static void main(String[] args) {
        MyClass a1 = new MyClass(1);
        MyClass a2 = new MyClass(1);
        MyClass a3 = a2;

        System.out.println(a1.equals(a2));          //Å¶2
        System.out.println(a2.equals(a3));          //Å¶3
    }
}