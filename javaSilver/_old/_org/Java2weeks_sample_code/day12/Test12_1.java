class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + "," + age;
    }
}
class Test12_1 {
    public static void main(String[] args) {
        Person p = new Person("Fukuda", 28);
        Object o = p;
        System.out.print(o);
    }
}
