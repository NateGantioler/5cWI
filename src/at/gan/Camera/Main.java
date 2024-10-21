package at.gan.Camera;

public class Main {
    public static void main(String[] args) {
        SD sdCard = new SD(20, 4);
        Camera cam = new Camera(1000, 100, 2, sdCard);

        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        
        cam.printAllPictures();
    }
}
