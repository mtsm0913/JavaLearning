interface I1 {}
interface I2 {}
class C implements I1 {}
class Sample9_6 {
    public static void main(String[] args) {
        I1 i1 = new C();
        I2 i2 = (I2)i1;                       //Å¶1
    }
}