class Test10_1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        for(int i = 0; i <= a.length; i++) {
            a[i] /= 10;
        }
        System.out.print(a[1] + ":" + a[2]);
    }
}