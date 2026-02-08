class Sample4_3 {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 20) {                                     //※1
            System.out.println("成年");                      //①
        } else if (age >= 0) {
            System.out.println("未成年");                    //②
        } else {
            System.out.println("負の年齢になっています。");  //③
        }
    }
}
