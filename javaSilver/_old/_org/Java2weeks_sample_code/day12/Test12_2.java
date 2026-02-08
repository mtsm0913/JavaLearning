class Data { 
    int x;
    public boolean equals(Object obj) {
        Data d = (Data)obj;
        return d.x == x;
   }
}
class Test12_2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.x = 10;
        Data data2 = new Data();
        data2.x = 10;
        System.out.print(data1.equals(data2));
    }
}
