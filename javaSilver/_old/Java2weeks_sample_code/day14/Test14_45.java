class Sp { }
class Test14_45 {
    public static void main(String[] args) {
        Object o1 = new Sp();
        Object o2 = new String[3];
        Sp s = (Sp)o1;
        String str[] = (String[])o2;
    }
}
