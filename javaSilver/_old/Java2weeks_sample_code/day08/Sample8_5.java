class Person {                                                         //Å¶1
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return name + "," + age;
    }
}

class Student extends Person {                                         //Å¶2
    private String no;

    public Student(String name, int age, String no) {
        super(name, age);
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public String getInfo() {
        return "<" + getName() + "," + getAge() + "," + no + ">";
    }
}

class Employee extends Person {                                        //Å¶3
    private String company;
 
    public Employee(String name, int age, String company) {
        super(name, age);
          this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public String getInfo() {
        return "[" + getName() + "," + getAge() + "," + company + "]";
    }
}

class Viewer {
    private Person person;                                            //Å¶4

    public void setPerson(Person person) { 
        this.person = person;
    }

    public void showInfo() { 
        System.out.println(person.getInfo());
    }
}

class Sample8_5 {
    public static void main(String[] args) {
        Viewer v = new Viewer();

        v.setPerson(new Student("Yamada", 18, "A001"));
        v.showInfo();

        v.setPerson(new Employee("Fukada", 34, "Shoeisha"));
        v. showInfo();
    }
}