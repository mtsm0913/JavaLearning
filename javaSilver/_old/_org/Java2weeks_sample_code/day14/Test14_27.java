class Test14_27 {
    public static void main(String[] args) {
        int x = 4;
        if(x % 2 == 0) {
            if(++x > 4)
                System.out.print("A");
                System.out.print("B");
        } else {
            System.out.print("C");
        }
    }
}
