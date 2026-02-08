class Test5_9 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        for ( ; a <= 3; a++) {
            if (a % 2 == 1) {
                b++;
            }
        }
        System.out.print(a + ":" + b);
    }
}
