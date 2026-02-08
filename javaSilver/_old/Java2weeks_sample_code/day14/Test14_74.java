class Test14_74 {
    public static void main(String[] args) {
        String str = "fish";
        switch(str.substring(2)) {
            case "fi":
                System.out.print("A-");
            case "sh":
                System.out.print("B-");
                break;
            default:
                System.out.print("C-");
        }
        System.out.print(str);
    }
}
