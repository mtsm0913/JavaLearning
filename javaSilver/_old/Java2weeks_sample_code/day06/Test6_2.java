class Test6_2 {
    public static void main(String[] args) {
        double[] results = new double[3];
        int[] a1 = {10, 20, 30};
        double[] a2 = {1.2, 3.4, 5.6};
        for (int i = 0; i < results.length; i++) {
            results[i] = a1[i] * a2[i];
        }
        System.out.print(results[1]);
    }
}
