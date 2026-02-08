class Test4_2 {
    public static void main(String[] args) {
        int i = 12;
        if (i % 6 == 0) {
            if (i % 5 != 0) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
            System.out.print("C");
        } else if (i % 4 == 0) {
            System.out.print("D");
        }
    }
}
