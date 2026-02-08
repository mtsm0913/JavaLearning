class Test4_4 {
    public static void main(String[] args) {
        int x = 3;
        switch (++x / 2) {
        case 1:
            System.out.print("A");
        case 2:
            System.out.print("B");
        default:
            System.out.print("C");
        }
    }
}
