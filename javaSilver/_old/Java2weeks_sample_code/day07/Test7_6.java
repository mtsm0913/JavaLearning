class Item {
    String name;
    int price;
    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    int getTaxPrice() {
        return (int)(price * 1.08);
    }
    void showInfo() {
        System.out.print(name + "," + getTaxPrice());
    }
}
class Test7_6 {
    public static void main(String[] args) {
        Item item = new Item("pen", 100);
        item.showInfo();
    }
}