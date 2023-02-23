public class ImageFile implements DisplayObject {
    final private BufferedImage bufferedImage;   //solid line means, that in this class(ImageFile) exists the variable of dependent class(BufferedImage)
    public ImageFile() {                            // empty rhombus if we paste object of dependent class as argument
        this.bufferedImage = new BufferedImage();  //solid rhombus in UML means you need to create dependent class's object in this class constructor
    }
    @Override
    public void display() {
        System.out.printf("Buffered image has content: %s \n", bufferedImage.getContent());
    }

    //@Override
    public BufferedImage load(){
        return bufferedImage;
    }
}
