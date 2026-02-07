/*
問題14：配列の中に0があるかどうか判定
条件
- int[] nums = {1,2,0,4}
- 0 があれば「0あり」
*/

class A14070114 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,4};
        int zeroCount = 0;
        for (int n : nums) {
            if (n == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("0あり");
        }
    }
}
