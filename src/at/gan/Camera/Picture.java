package at.gan.Camera;

public class Picture {
    private int size;
    private String name;
    private long creationDate;

    private Picture(int size, String name)
    {
        this.size = size;
        this.name = name;
        this.creationDate = System.currentTimeMillis();
    } 

    public int getSize() {
        return size;
    }
}
