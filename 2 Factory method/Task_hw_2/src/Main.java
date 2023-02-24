import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("./Task_hw_2\\src\\input1.txt");
        Scanner sc = new Scanner(file);

        int i=0;
        String line;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            String[] res = line.strip().split("\\s+");
            int[] intRes = Arrays.stream(res).mapToInt(num -> Integer.parseInt(num)).toArray();
            Arrays.stream(intRes).forEach(System.out::print);
            System.out.println("");
        }
    }
}