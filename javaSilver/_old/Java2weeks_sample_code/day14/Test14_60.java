class Student {
    private String name;
    private int id; 
    Student(String name) {
        this.name = name;
    }
    Student(int id) {
        this.id = id;
    }
    Student(String name, id int) {
        this(name);
        this(id);
    }
}
class Test14_60 {
    public static void main(String[] args) {
        Student stu = new Student("Lucy", 23);
        System.out.print(stu.name + "," + stu.id);
    }
}
