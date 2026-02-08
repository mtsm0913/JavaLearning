interface I {}
class S implements I {}
class C {}
class Sample9_5 {
    public static void main(String[] args) {
        S s = new S();
        I i = s;                                //Å¶1
        S x = (S)i;                             //Å¶2
        C y = (C)i;                             //Å¶3
    }
}