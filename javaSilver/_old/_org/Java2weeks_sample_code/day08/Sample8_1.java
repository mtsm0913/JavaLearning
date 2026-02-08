class Person {                                              //Å¶1
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Student extends Person {                              //Å¶2
    private String no;
    public Student(String name, String no) {
        super(name);                                        //Å¶3
        this.no = no;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
}
class Sample8_1 {
    public static void main(String[] args) {
        Student s = new Student("éRìcëæòY", "A001");
        System.out.println(s.getName() + "," s.getNo());    //Å¶4
    }
}