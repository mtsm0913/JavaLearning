class Sample6_7 {
    public static void main(String[] args) {
        int[][] a ;                                  //Å¶1
        a = new int[2][3];                           //Å¶2

        a[0][0] = 11;                                //Å¶3
        a[0][1] = 12;
        a[0][2] = 13;
        a[1][0] = 21;
        a[1][1] = 22;
        a[1][2] = 23;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");     //Å¶4
            }
            System.out.println();
        }
    }
}