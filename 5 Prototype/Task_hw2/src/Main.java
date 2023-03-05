import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        X originalX = new X();
        originalX.addY(new Y(1));
        originalX.addY(new Y(2));
        originalX.addY(new Y(3));

        X prototypedX = originalX.prototype();
        prototypedX.addY(new Y(5));

        System.out.println("Original X:" + originalX);
        System.out.println("Prototyped X:" + prototypedX);
    }
}