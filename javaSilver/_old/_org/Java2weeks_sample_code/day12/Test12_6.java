class Test12_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("fish");
        sb.insert(4, "-").replace(0, 2, "a");
        System.out.println(sb);
    }
}