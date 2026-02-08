class Test4_5 {
    public static void main(String[] args) {
        int x = 0;
        int y = x++;
        int z = ++y;
        int result = (z > y + 1) ? y : z;
        System.out.print("result=" + result);
    }
}
