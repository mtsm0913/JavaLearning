/*
問題16：午前か午後か
条件
- int hour = 14
- 12 未満 → 午前
- 12 以上 → 午後
*/

class a_14_3_3_16 {
    public static void main(String[] args) {
        int hour = 14;
        if (hour < 12) {
            System.out.println("午前");
        } else {
            System.out.println("午後");
        }
    }
}
