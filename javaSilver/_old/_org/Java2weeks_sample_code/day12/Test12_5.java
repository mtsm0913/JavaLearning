class Test12_5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb1.equals(sb2));       //コード①
        sb1.append(sb2);
        System.out.println(sb1);                   //コード②
    }
}