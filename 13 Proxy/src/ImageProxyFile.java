public class ImageProxyFile implements DisplayObject{
    private String path;
    public ImageProxyFile(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        new ImageFile(this.path).display();
    }
}
