class Test14_36 {
    public static void main(String[] args) {
        String str = "abc";
        str += str;
        str = str.concat("ab");
        str = str.replace("abc", "x");
        System.out.print(str.endsWith("xab"));
    }
}
