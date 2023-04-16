import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    public static void main(String[] args) {

        String[] equations = {
                "2+4",
                "-12/0",
                "5.777-5.777",
                "2.1+0.231423423423423"
        };


        String pattern = "(\\-?\\d+\\.?\\d*)([+\\-*/])(\\d+\\.?\\d*)";
        float a;
        float b;
        String operation;
        float result;
        // Create a Pattern object and compile the regular expression pattern
        Pattern regex = Pattern.compile(pattern);

        for (String equation : equations) {
            Matcher matcher = regex.matcher(equation);
            if (matcher.matches()) {
                a = Float.parseFloat(matcher.group(1));
                operation = matcher.group(2);
                b = Float.parseFloat(matcher.group(3));
                result = ClassHelper.getHandlers().handle(a,b,operation);

                System.out.println(equation+"="+result);
            } else{
                System.out.println("Problems with equation");
            }
        }
    }
}