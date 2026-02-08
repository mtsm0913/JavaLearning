class Sample5_9 {
    public static void main(String[] args) {
        outerLoop:
        for (int x = 1; x <= 3; x++) {		//¦1
            for (int y = 1; y <= 5; y++) {	//¦2
                if (x == 1 & y == 2) {
                    break outerLoop;      
                }
                System.out.print(x + ":" + y);
            }
        }
    }
}
