package at.gan.Camera;

import java.util.ArrayList;

public class SD {
    private int capacity;
    private ArrayList<Picture> pictures = new ArrayList<Picture>();
    private int storage;
    private int warningAmount;

    private SD(int capacity, int warningAmount)
    {
        this.capacity = capacity;
        this.warningAmount = warningAmount;
        storage = this.capacity;
    }

    public void AddPicture(Picture pic)
    {
        if(storage -pic.getSize() <= 0)
        {
            Full();
            return;
        }
        else if(storage -pic.getSize() <= warningAmount)
        {
            Warning();
        }
        pictures.add(pic);
        storage -= pic.getSize();
    }

    private void Warning()
    {
        System.out.println("Warning: the storage is nearly full!");
    }

    private void Full()
    {
        System.out.println("Storage is Full, Picture could not be taken!");
    }
}
