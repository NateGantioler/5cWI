package at.gan.Interface.Store;

public class main {
    public static void main(String[] args) {

        GUI gui = new GUI();
        Product shoe1 = new Shoe(40,150,"AirForce");
        Product hat1 = new Hat("Old", 100, "Jurrrrr");

        gui.AddProduct(shoe1);
        gui.AddProduct(hat1);
        gui.getProducts();
    }
}
