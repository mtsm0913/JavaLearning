/*
問題8：3の倍数なら「Fizz」
条件
- int n = 9
- 3 の倍数なら表示
*/

class a_14_3_3_08 {
    public static void main(String[] args) {
        int n = 9;
        if (n % 3 == 0) {
            System.out.println("Fizz");
        }
    }
}
