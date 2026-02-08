class Data {
    int d;
}
class Test11_2 {
    public static void main(String[] args) {
        Data d1 = null;
        Data d2 = null;
        d1 = new Data();
        d2 = new Data();
        d1 = d2;
        d2 = null;
    }
}