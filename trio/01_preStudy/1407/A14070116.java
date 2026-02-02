/*
問題16：配列の最小値を条件付きで表示
条件
- int[] arr = {8,3,6}
- 最小値が 5 以下なら「小さい」
*/

class A14070116 {
    public static void main(String[] args) {
        int[] arr = {8,3,6};
        int min = 9999;
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        if (min <= 5) {
            System.out.println("小さい");
        }
    }
}

// 別解
// class A14070116 {
//     public static void main(String[] args) {
//         int[] arr = {8, 3, 6};

//         int min = arr[0];
//         for (int n : arr) {
//             if (n < min) {
//                 min = n;
//             }
//         }

//         if (min <= 5) {
//             System.out.println("小さい");
//         }
//     }
// }
