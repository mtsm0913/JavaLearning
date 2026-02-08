class Test6_3 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = a;
        for (int i = 0; i < b.length; i++)
            b[i] += i;
        System.out.print(a[1]);
    }
}