class Sample6_1 {
    public static void main(String[] args) {
        int[] a;                             //Å¶1
        a = new int[3];                      //Å¶2

        a[0] = 10;                           //Å¶3
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] + " ");    //Å¶4
        }
    }
}