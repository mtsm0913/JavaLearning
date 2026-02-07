// 問題7：型エラーを見つけよう
// 次のコードを見て、どこが間違っているかを説明しなさい。（コードは書き直さなくてOK）

// class A0107 {
//     public static void main(String[] args) {
//         int score = 90;
//         score = "high";
//         System.out.println(score);
//     }
// }

// 7行目が誤り
// int型の変数に文字列を再代入しようとしているため。
