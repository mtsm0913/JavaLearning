class Sample4_6 {
    public static void main(String[] args) {
        int num = 1;
        switch (++num) {			//Å¶1
        case 1:
            System.out.println("A");
            break;
        case 2:					//Å¶2
            System.out.println("B");
        case 3:
            System.out.println("C");
            break;
        default:
            System.out.println("default");
        }
    }
}
