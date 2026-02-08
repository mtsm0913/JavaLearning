class A { }
class B extends A { }
class C extends B { }
class Test14_17 {
    public static void main(String[] args){
        B x = new B();
        B y = x;
        A z = (A)y;
        C w = (C)z;
    }
}
