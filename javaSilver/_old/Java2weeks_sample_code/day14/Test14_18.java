class Test14_18 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        s.append("java");
        s.insert(3, "java");
        s.delete(1, 5);
        System.out.println(s);
    }
}
