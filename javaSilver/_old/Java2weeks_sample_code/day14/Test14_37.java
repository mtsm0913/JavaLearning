class Data {
    int d;
    Data(int d) {
        this.d = d;
    }
}
class Test14_37 {
    public static void main(String[] args) {
        Data d1 = new Data(10);
        Data d2 = new Data(20);
        d2 = d1;
        d1 = null;
        d2 = new Data(10);
        d2.d = 0;
    }
}
