class Test14_59 {
    private final static int ZERO = 0;
    private final static int ONE = 1;
    public static void main(String[] args) {
        int count = 0;
        outer: while(true) {
            switch(++count % 2) {
                case ZERO: break outer;
                case ONE:  break;
            }
        }
        System.out.print(count);
    }
}
