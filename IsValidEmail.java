package JavaLearning;

/*
 * あるメールアドレス email を受け取るので、それが正しいものであれば true を、
 * そうでなければ false を返す isValidEmail という関数を作成してください。
 * ここでの正しいアドレスというのは以下の 4 つの条件を満たすものを指します。
 * ・「@」から始まらないこと
 * ・スペースがないこと
 * ・「@」を 1 つのみ含んでいること
 * ・「@」の後に「.」があること
 */
public class IsValidEmail {
    public static boolean isValidEmail(String email) {
        if (email.indexOf("@") <= 0) {
            return false;
        } else if (email.indexOf(" ") < 0) {
            return false;
        } else if (email.indexOf("@") > 0) {
            if (email.substring(email.indexOf("@") + 1, email.length()).indexOf("@") >= 0) {
                return false;
            } else if (email.substring(email.indexOf("@") + 1, email.length()).indexOf(".") < 0) {
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isValidEmail("ccc@aaa.com"));
        // System.out.println(isValidEmail(""));
        // System.out.println(isValidEmail(""));
        // System.out.println(isValidEmail(""));
        // System.out.println(isValidEmail(""));
        // System.out.println(isValidEmail(""));
        // System.out.println(isValidEmail(""));
    }
}
