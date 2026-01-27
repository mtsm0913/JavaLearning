/*
問題13：大文字か小文字か判定
条件
- char c = 'A'
- 'A'〜'Z' なら大文字
*/

class a_14_3_3_13 {
    public static void main(String[] args) {
        char c = 'A';
        if (c >= 'A' && c <= 'Z') {
            System.out.println("大文字");
        }
    }
}
