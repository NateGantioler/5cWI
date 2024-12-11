package at.gan.Interface.Store;

public class Shoe implements Product{
    private int size;
    private int price;
    private String name;

    public Shoe(int size, int price, String name)
    {
        this.size = size;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
