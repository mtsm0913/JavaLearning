class Sample6_6 {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};                 //Å¶1
        int[] a2 = a1;                           //Å¶2

        for (int i = 0; i < a1.length; i++) {    //Å¶3
            System.out.print(a1[i] + " ");
        }
        System.out.println();

        a2[0] = 100;                             //Å¶4

        for (int i = 0; i < a1.length; i++) {    //Å¶5
            System.out.print(a1[i] + " ");
        }
    }
}