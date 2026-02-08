class Test14_30 {
    public static void main(String[] args) {
        int[] a = new int[3];
        try {
            a[3] = 10;
            System.out.print("A");
        } catch(RuntimeException e) {
            System.out.print("B");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }   
    }
}
