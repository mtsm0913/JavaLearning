class Student {
    String name;
    int age;
    Student(String _name, int _age) {
        name = _name;
        age = _age;
    }
}
class Sample7_1 {
    public static void main(String[] args) {
        Student s1 = new Student("山田太郎", 28);	//※1
        System.out.println(s1.name + "," + s1.age);	//※2

        Student s2 = new Student("山本花子", 20);	//※3
        System.out.println(s2.name + "," + s2.age);	//※4
    }
}