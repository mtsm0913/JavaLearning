class Sample5_7 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x++;
            if (x % 2 == 0) {
                continue;			//¦1
            }
            System.out.print(x + " ");
        }
    }
}