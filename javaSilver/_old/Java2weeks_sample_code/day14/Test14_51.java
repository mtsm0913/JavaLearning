class Test14_51 {
    static double area;
    int b = 2;
    int h = 3;
    public static void main(String[] args) {
        double rate = 0, b = 0, h = 0;
        if(area == 0) {
            b = 3;
            h = 4;
            rate = 0.5;
        }
        area = rate * b * h;
        System.out.print(area);
    }
}
