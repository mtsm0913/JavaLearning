// 問題8：10回ループして合計値を求める（do-while）
// 条件
//  1〜10 の合計（do-while）

class A14070208 {
    public static void main(String[] args) {
        
        // Variable definition
        int num = 1;
        int total = 0;
        
        // Calculation
        do {
            total += num;
            num++;
        } while (num <= 10);
        
        // Output
        System.out.println(total);
    }
}
