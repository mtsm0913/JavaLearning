package JavaLearning;

public class myXOR {
    public static boolean myXOR_test_01(boolean p, boolean q){
        if (p && q) return false;
        else if (p || q) return true;
        else return false;
    }

    public static void main(String[] args){
        System.out.println(myXOR(true, false));
        System.out.println(myXOR(false, true));
        System.out.println(myXOR(false, false));
        System.out.println(myXOR(true, true));
    }
}
