import com.grohvlad.equation.*;

public class Main {
    public static void main(String[] args) {
//        IEquation eq = new Equation(1,2);
//        IEquation qd = new QuadraticEquation(1,2,3);
//        IEquation bi = new BiQuadraticEquation(1,2,3);
//
//        System.out.println(eq.giveCondition());
//        System.out.println(qd.giveCondition());
//        System.out.println(bi.giveCondition());

        IEquation eq = new Equation(1,2);
        IEquation eq_clone = eq.clone();

        System.out.println(eq.giveCondition());
        System.out.println(eq_clone.giveCondition());

        System.out.println("Change first equation");
        eq.change_b(2);
        eq.change_c(5);
        System.out.println(eq.giveCondition());
        System.out.println(eq_clone.giveCondition());

        System.out.println("They also have solutions");
        System.out.println(eq.solve().getResult());
        System.out.println(eq_clone.solve().getResult());
    }
}