/*
問題6：営業時間かどうか判定
条件
- int hour = 18
- 9〜17 時なら「営業中」
- それ以外は「閉店」
*/

class a_14_3_3_06 {
    public static void main(String[] args) {
        // int hour = 18;
        // int hour = 17;
        // int hour = 9;
        int hour = 8;
        if (hour >= 9 && hour <=17) {
            System.out.println("営業中");
        } else {
            System.out.println("閉店");
        }
    }
}
