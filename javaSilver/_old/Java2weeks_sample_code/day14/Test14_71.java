class Animal {
    public void foo() {
        System.out.print("A");
    }
}
class Cat extends Animal {
    public void bar() {
        System.out.print("B");
    }
}
class Test14_71 {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.foo();
        c.bar();
    }
}
