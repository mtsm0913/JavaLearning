class Test4_6 {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.print(a ^ b ? (!!a ? !b : a & b) : a | b);
    }
}
