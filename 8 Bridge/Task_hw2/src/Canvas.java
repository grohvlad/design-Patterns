import com.grohvlad.sizes.*;
import com.grohvlad.buttons.*;

public class Canvas {
    public static void main(String[] args) {
        Button checkbox = new Checkbox(new Large());
        checkbox.draw();

        Button radio = new Radio(new Medium());
        radio.draw();

        Button but3 = new ImageButton(new UserSize());
        but3.draw();
    }
}
