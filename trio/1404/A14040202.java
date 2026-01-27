/*
問題2：do-whileでメッセージを3回表示
条件
- 「Hello」を3回表示する
- do-while を使う
*/

class A14040202 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello");
            i++;
        } while (i <= 3);
    }
}
