class Test14_4 {
    static void methodA(){
        try{
            int[] a = new int[3];
            a[3] = 10;
            System.out.print("A");
        } catch(Exception e){
            System.out.print("B");
        }
    }
    static void methodB(){
        try{
            methodA();
            System.out.print("C");
        } catch(Exception e){
            System.out.print("D");
        }
    }
    public static void main(String[] args){
        try{
            methodB();
            System.out.print("E");
        } catch(Exception e){
            System.out.print("F");
        }
    }
}