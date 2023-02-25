package com.grohvlad;

import com.grohvlad.equation.*;
import com.grohvlad.result.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {
//        IResult ex = getEquationTypeSolver("biquad").createEquation(0,0,0).solve();
//        System.out.println(ex.isInfinityResult());
//        System.out.println(ex.getResult());

        String in = "./Task_hw_2\\src\\com\\grohvlad\\input\\input";
        String out = "./Task_hw_2\\src\\com\\grohvlad\\output\\output";

        String line;
        IEquation equation;
        IResult result;
        Scanner sc;
        FileWriter fileOut;
        File fileToOut;
        String lineToOut;
        ArrayList<Double> maxMinResult;

        int i = 1;
        File fileIn = new File(in+i+".txt");
        while(fileIn.exists()){
            sc = new Scanner(fileIn);

            maxMinResult = new ArrayList<>();
            fileToOut = new File(out+i+".txt");
            if(!fileToOut.exists()){
                fileToOut.createNewFile();
            }
            fileOut = new FileWriter(out+i+".txt",false);



            while (sc.hasNextLine()) {
                lineToOut = "";
                line = sc.nextLine();
                lineToOut += line + " ".repeat(30 - line.length());


                int[] res = Arrays.stream(line.strip().split("\\s+")).mapToInt(Integer::parseInt).toArray();

                if(res.length == 2){
                    equation = getEquationTypeSolver("eq").createEquation(0,res[0],res[1]);
                } else if(res.length == 3){
                    equation = getEquationTypeSolver("quad").createEquation(res[0], res[1], res[2]);
                } else if(res.length == 5){
                    equation = getEquationTypeSolver("biquad").createEquation(res[0],res[2],res[4]);
                } else {
                    System.out.printf("Something wrong with %s", res);
                    equation = null;
                }

                if(equation != null){
                    result = equation.solve();
                    if(result.isInfinityResult()){
                        lineToOut += "infinite number of answers\n";
                    } else {
                        lineToOut += "   (number of answers: "+ result.getResult().size()+ "), answers: " + result.getResult() + "\n";
                    }

                    fileOut.write(lineToOut);
                }
            }

            fileOut.close();
            i++;
            fileIn = new File(in+i+".txt");
        }
    }
    private static ICreateResult inf_creator = new Result_inf_creator();
    private static ICreateResult n_creator = new Result_n_creator();
    private static Map<String, ICreateResult> resultCreatorList = new HashMap<>(){{
        put("inf", inf_creator);
        put("n", n_creator);
    }};

    public static ICreateResult getEmptyResult(String name){
        return resultCreatorList.get(name);
    }

    private static IEquationCreator equationCreator = new EquationCreator();
    private static IEquationCreator quadraticEquationCreator = new QuadraticEquationCreator();
    private static IEquationCreator biQuadraticEquationCreator = new BiQuadraticEquationCreator();
    private static Map<String, IEquationCreator> equationCreatorList = new HashMap<>(){{
        put("eq", equationCreator);
        put("quad", quadraticEquationCreator);
        put("biquad", biQuadraticEquationCreator);

    }};
    public static IEquationCreator getEquationTypeSolver(String type){
        return equationCreatorList.get(type);
    }
}
