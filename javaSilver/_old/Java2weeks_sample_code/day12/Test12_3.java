class Test12_3 {
    public static void main(String[] args) {
        String s1 = "fish";
        String s2 = "fish";
        String s3 = new String("fish");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}