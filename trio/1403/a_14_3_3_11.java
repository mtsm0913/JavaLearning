/*
問題11：論理演算 OR を使う
条件
- boolean holiday = true
- boolean rain = false
- どちらかが true なら「出かける」
*/

class a_14_3_3_11 {
    public static void main(String[] args) {
        boolean holiday = true;
        boolean rain = false;
        if (holiday || rain) {
            System.out.println("出かける");
        }
    }
}
