class Sample12_5 {
    public static void main(String[] args) {
        String s = "Hello";

        s = s.concat("World");          //Å¶1
        System.out.println(s); 

        s = s.toLowerCase();            //Å¶2
        System.out.println(s); 

        s = s. substring(0, 5);         //Å¶3
        System.out.println(s); 
    }
}