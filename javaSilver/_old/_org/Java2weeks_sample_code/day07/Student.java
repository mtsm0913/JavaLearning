public class Student {
    private String name;   // –¼
    private int age;       // ”N—î

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            // age‚ª•‰‚Ìê‡‚Ìˆ—
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}
