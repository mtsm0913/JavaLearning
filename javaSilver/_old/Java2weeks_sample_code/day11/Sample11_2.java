class MyData {
    String str;
    MyData(String str) { this.str = str; }
}
class Test11_2 {
    public static void main(String[] args) {
        MyData md1 = new MyData("hello1");		//Å¶1
        MyData md2 = new MyData("hello2");		//Å¶2
        System.out.println(md1.str);
        md2 = md1;					//Å¶3
    }
}