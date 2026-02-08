class MyClassA {
    MyClassA() {
        System.out.print("A");
    }
}
class MyClassB extends MyClassA {
    MyClassB() {
        System.out.print("B");
    }
}
class MyClassC extends MyClassB {
    MyClassC() {
        System.out.print("C");
    }
}
class Test14_57 extends MyClassC {
    public static void main(String[] args) {
        new Test14_57();
    }
}
