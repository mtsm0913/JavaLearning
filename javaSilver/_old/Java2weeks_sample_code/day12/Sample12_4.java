class Sample12_4 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = "Hello";

        System.out.println(s1 == s2);          //Å¶1
        System.out.println(s2 == s3);          //Å¶2

        System.out.println(s1.equals(s2));     //Å¶3
        System.out.println(s2.equals(s3));     //Å¶4
    }
}