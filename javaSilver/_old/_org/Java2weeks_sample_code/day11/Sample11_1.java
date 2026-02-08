class MyData {
    String str;
    MyData(String str) { this.str = str; }
}
class Test11_1 {
    public static void main(String[] args) {
        MyData md = new MyData("hello");
        System.out.println(md.str);
        md = null;
    }
}