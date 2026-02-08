class Data {
   Data d;
}
class Test11_3 {
    public static void main(String[] args) {
        Data d = new Data();
        d.d = new Data();
        d.d.d = d;
        d = null;
        d = new Data();
    }
}