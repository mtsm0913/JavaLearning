class NameManager {
    static String first;
    static String last;
    static void setName(String _first, String _last) {
        first = _first;
        last = _last;
    }
    static void showFullName() {
        System.out.print(first + " " + last);
    }
}
class Test7_5 {
    public static void main(String[] args) {
        String first = "John", last = "Smith";
        NameManager.setName(first, last);
        NameManager.showFullName();
    }
}
