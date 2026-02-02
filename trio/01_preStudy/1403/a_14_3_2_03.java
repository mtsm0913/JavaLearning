// 問題3：会員判定（論理演算の練習）
// 条件
// - boolean isMember = true;
// - boolean hasCoupon = false;
// - 「会員またはクーポン所持」の場合→「割引対象」
// - どちらもfalse→「対象外」

class a_14_3_2_03 {
    public static void main(String[] args) {
        // boolean isMember = true;
        boolean isMember = false;
        boolean hasCoupon = false;
        // boolean hasCoupon = true;
        if (isMember || hasCoupon) {
            System.out.println("割引対象");
        } else {
            System.out.println("対象外");
        }
    }
}
