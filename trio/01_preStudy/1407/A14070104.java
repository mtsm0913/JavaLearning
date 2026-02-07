/*
問題4：配列の中の正の数をすべて表示
条件
- int[] nums = {3, -1, 4, 0}
- 正の数だけ表示
*/

class A14070104 {
    public static void main(String[] args) {
        int[] nums = {3, -1, 4, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println(nums[i]);
            }
        }
    }
}

// 別解
// class A14070104 {
//     public static void main(String[] args) {
//         int[] nums = {3, -1, 4, 0};

//         for (int n : nums) {
//             if (n > 0) {
//                 System.out.println(n);
//             }
//         }
//     }
// }
