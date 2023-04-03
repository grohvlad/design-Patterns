public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject[] images = {
                new ImageFile("Sources/image1.jpeg"),
                new ImageFile("Sources/image2.jpeg"),
                new ImageFile("Sources/image3.jpeg"),
                new ImageFile("Sources/image4.jpeg"),
                new ImageFile("Sources/image5.jpeg"),
                new ImageFile("Sources/image6.jpeg"),
                new ImageFile("Sources/image7.jpeg"),
                new ImageFile("Sources/image8.jpeg"),
                new ImageFile("Sources/image9.jpeg"),
                new ImageFile("Sources/image10.jpeg"),
        };

        DisplayObject[] imagesWithProxy = {
                new ImageProxyFile("Sources/image1.jpeg"),
                new ImageProxyFile("Sources/image2.jpeg"),
                new ImageProxyFile("Sources/image3.jpeg"),
                new ImageProxyFile("Sources/image4.jpeg"),
                new ImageProxyFile("Sources/image5.jpeg"),
                new ImageProxyFile("Sources/image6.jpeg"),
                new ImageProxyFile("Sources/image7.jpeg"),
                new ImageProxyFile("Sources/image8.jpeg"),
                new ImageProxyFile("Sources/image9.jpeg"),
                new ImageProxyFile("Sources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

        System.out.println(" Using Proxy method: ");

        for (DisplayObject image : imagesWithProxy) {
            image.display();
        }

    }

}