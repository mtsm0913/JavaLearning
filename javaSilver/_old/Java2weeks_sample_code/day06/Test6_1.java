class Test6_1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i <= 3; i++) {
            numbers[i] = i * 10;
        }
        for (int n: numbers) {
            System.out.print(n + " ");
        }
    }
}
