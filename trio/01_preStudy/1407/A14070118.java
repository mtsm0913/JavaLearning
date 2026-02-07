/*
問題18：配列の平均が60以上なら合格
条件
- int[] scores = {70,50,60}
*/

class A14070118 {
    public static void main(String[] args) {
        int[] scores = {70,50,60};
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        if (total / scores.length >= 60) {
            System.out.println("合格");
        }
    }
}
