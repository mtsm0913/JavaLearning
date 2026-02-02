/*
問題2：文字列配列をfor-eachで回そう
条件
- "Apple", "Banana", "Orange" の3つを String 配列に入れる
- for-eachで1つずつ表示する
*/

class A14060202 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
