import com.grohvlad.component.*;
import com.grohvlad.decorators.*;

public class Main {

    public static void main(String[] args) {
        Component str = new EmptyBase();
        str = new PostComaDecorator(str);
        str = new PostSpaceDecorator(str);
        str = new PostWordDecorator(str, "Word");
        str = new PostExclaimDecorator(str);
        str = new PostEndlDecorator(str);
        str.print();
        str = new PreWordDecorator(str, "Hello");
        str.print();
    }

}