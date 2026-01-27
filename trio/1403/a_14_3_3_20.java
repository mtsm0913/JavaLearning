/*
問題20：複数条件の総まとめ
条件
- int score = 55
- 80以上 →「優秀」
- 60以上 →「普通」
- それ以外 →「がんばろう」
*/

class a_14_3_3_20 {
    public static void main(String[] args) {
        int score = 55;
        if (score >= 80) {
            System.out.println("優秀");
        } else if (score >= 60) {
            System.out.println("普通");
        } else {
            System.out.println("がんばろう");
        }
    }
}
