package com.grohvlad;

import com.grohvlad.equation.*;
import com.grohvlad.result.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {


//        File file = new File("./Task_hw_2\\src\\com\\grohvlad\\input\\input1.txt");
//        Scanner sc = new Scanner(file);
//
//        int i=0;
//        String line;
//        while (sc.hasNextLine()) {
//            line = sc.nextLine();
//            int[] res = Arrays.stream(line.strip().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//            //res.length
//        }
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