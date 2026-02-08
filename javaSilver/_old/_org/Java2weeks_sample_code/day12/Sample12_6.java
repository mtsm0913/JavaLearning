class Sample12_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append("World!");          //Å¶1
        System.out.println(sb);

        sb.insert(5, ",");            //Å¶2
        System.out.println(sb);

        sb.delete(5, 11);             //Å¶3
        System.out.println(sb);		
    }
  }