/*
問題5：点数に応じてランク表示
条件
- int score = 92
- 90以上 A
- 70以上 B
- それ以外 C
*/

class a_14_3_3_05 {
    public static void main(String[] args) {
        // int score = 90;
        // int score = 89;
        // int score = 70;
        // int score = 69;
        // int score = 0;
        int score = -1;
        if (score >= 90) System.out.println("A");
        else if (score >= 70) System.out.println("B");
        else System.out.println("C");
    }
}
