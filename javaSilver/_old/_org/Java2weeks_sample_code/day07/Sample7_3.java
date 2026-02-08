class Student {
    static String name;
    static void show() {
        System.out.print(name);               //¦1
    }
}
class Sample7_3 {
    public static void main(String[] args) {
        Student.name = "R“c‘¾˜Y";            //¦2
        Student.show();                       //¦3
    }
}