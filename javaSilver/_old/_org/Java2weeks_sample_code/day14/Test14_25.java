abstract class S {
    public abstract int getX();
}
class T extends S {
    private int x;
    T (int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
}
class Test14_25 {
    public static void main(String[] args) {
        Object[] objs = {new T(2), new T(4)};
        for(Object o: objs) {
            S s = (S)o;
            System.out.print(s.getX());
        }
    }
}
