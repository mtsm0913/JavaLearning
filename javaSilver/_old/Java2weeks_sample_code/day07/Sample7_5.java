class MyClass {
    MyClass() {
        System.out.println("MyClass()ÅF");
    }
    MyClass(String s) {
        System.out.println("MyClass(String)ÅF" + s);
    }
    MyClass(String s1, String s2) {
        System.out.println("MyClass(String,String)ÅF" + s1 + "," + s2);
    }
}
class Sample7_5 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();                 //Å¶1
        MyClass mc2 = new MyClass("A");              //Å¶2
        MyClass mc3 = new MyClass("A","B");          //Å¶3
        // MyClass mc4 = new MyClass("A","B","C");   //Å¶4
    }
}
