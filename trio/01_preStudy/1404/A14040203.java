/*
問題3：0になるまでカウントダウン
条件
- int num = 3;
- while文で 3, 2, 1, 0 を順に表示する
- num-- を使ってOK
*/

class A14040203 {
    public static void main(String[] args) {
        int num = 3;
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
