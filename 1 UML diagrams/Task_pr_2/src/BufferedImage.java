import java.util.Random;
public class BufferedImage {
    final private int content;
    public BufferedImage() {
        Random random = new Random();
        this.content = random.nextInt(512);
    }
    public int getContent() {
        return content;
    }
}
