class Test3_11 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println(++x > 0 & y++ > 0);	// ‡@
        System.out.println(y);			// ‡A
    }
}
