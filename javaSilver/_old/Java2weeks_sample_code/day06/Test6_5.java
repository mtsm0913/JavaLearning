class Test6_5 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.print(sum);
    }
}
