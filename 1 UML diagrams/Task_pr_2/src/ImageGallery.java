public class ImageGallery {
    public static void main(String[] args) {
        ImageGallery imageGallery = new ImageGallery() ;

        DisplayObject object = new ImageFile();
        object.display();  //It may be correct creation trough interface, but I can`t see how to use load method with this variable if there are no such interface method

        ImageFile obj1 = imageGallery.create(); // So I thought that ImageFile implements DisplayObject and this way may be correct
        ImageFile obj2 = imageGallery.create();
        ImageFile obj3 = imageGallery.create();
        ImageFile obj4 = imageGallery.create();

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();

        imageGallery.store(obj1);
        imageGallery.store(obj3);
        imageGallery.store(obj4);

        imageGallery.showGallery();
        }

    private final BufferedImage[] allFiles = new BufferedImage[5]; // Gallery can contain up to 5 image files
    public ImageFile create(){
        return new ImageFile();
    }
    public void store(ImageFile file){
        for(int i = 0; i<allFiles.length; i++ ){
            if(allFiles[i] == null){
                allFiles[i] = file.load();
                break;
            }
        }
    }
    public void showGallery(){
        System.out.println("In your gallery are stored:");
        for(BufferedImage item: allFiles){
            if(item != null){
                System.out.println(item.getContent());
            }
        }
    }
}