class Test14_33 {
    static int[] foo(int[] a) {
        for(int i = 0; i < 3; i++)
        a[i] += 10;
        return a;
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = foo(a1);
        for(int j = 0; j < a1.length; j++)
            a1[j] = a1[j] + a2[j];
        System.out.print(a1[1]);
    }
}
