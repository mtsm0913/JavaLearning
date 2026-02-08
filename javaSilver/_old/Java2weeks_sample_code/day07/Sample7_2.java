class Student {
    String name;
    int age;
    Student(String name, int age) { 
        this.name = name;
        this.age = age;
    }
    String getData() {
        return name + "," + age;
    }
    void showData() {
        System.out.println(getData());
    }
}
class Sample7_2 {
    public static void main(String[] args) {
        Student s = new Student("山田太郎", 28);        //※1
        s.showData();                                   //※2
        s.name = "山本花子";                            //※3
        s.showData();                                   //※4
    }
}
