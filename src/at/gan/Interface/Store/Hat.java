package at.gan.Interface.Store;

public class Hat implements Product{

    private String style;
    private int price;
    private String name;

    public Hat(String style, int price, String name)
    {
        this.style = style;
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

    public String getStyle() {
        return style;
    }
}
