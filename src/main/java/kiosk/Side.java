package kiosk;

public class Side implements MenuItem{
    private String name;
    private int price;
    private int count;

    public Side(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

   @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }
    @Override
    public void setCount(int i) {
        this.count = i;
    }
}