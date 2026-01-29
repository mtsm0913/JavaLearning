/*
問題1：3人分の年齢を配列で管理しよう
条件
- int[] ages = {20, 25, 30}; を使う
- 3つの年齢を順番に表示する（ages[0], ages[1], ages[2]）
*/

class A14060101 {
    public static void main(String[] args) {
        int[] ages = {20, 25, 30};
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }
    }
}
