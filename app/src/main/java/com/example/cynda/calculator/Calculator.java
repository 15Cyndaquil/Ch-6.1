package com.example.cynda.calculator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by John Tyler Gafford on 11/29/16.
 */

public class Calculator {

    public static Double getSum(List<Double> n){
        int length = n.size();
        Double output = 0.0;
        for(int c=0; c<=length; c++){
            try{
                output = output +  n.get(c);
            }catch(IndexOutOfBoundsException e){
            }
        }
        return output;
    }

    public static Double getSum(double n, double x){
        Double output = n+x;
        return output;
    }

    public static Double getAverage(List<Double> n){
        int length = n.size();
        Double sum = 0.0;
        Double output = 0.0;
        for(int i=0; i<=length; i++){
            try{
                sum = sum + n.get(i);
            }catch(IndexOutOfBoundsException e){
            }
        }
        return output = sum/length;
    }

    public static Double getAverage(double n, double x){
        double output = (n+x)/2;
        return output;
    }

    public static Double getProduct(List<Double> n){
        int length = n.size();
        Double output = n.get(0);
        for(int i=1; i<=length; i++){
            try{
                output = output*n.get(i);
            }catch(IndexOutOfBoundsException e){
            }
        }
        return output;
    }

    public static Double getProduct(double n, double x){
        Double output = n*x;
        return output;
    }

    public static StringBuffer getFactorial(List<Double> n){
        StringBuffer output = new StringBuffer("");
        int length = n.size();
        for(int i=0; i<=length; i++){
            try{
                double fac = n.get(i);
                double out1 = fac;
                for (int c=1; c < fac; c++) {
                    out1 = out1 * (fac - c);
                }
                output.append("The factorial of "+n.get(i)+" is: "+out1+"\n");
            }catch(IndexOutOfBoundsException e){
            }
        }
        return output;
    }

    public static StringBuffer getFactorial(double x, double n){
        StringBuffer output = new StringBuffer("");
        double out = x;
        double out1 = n;
        for (int c=1; c < x; c++) {
            out = out * (x - c);
        }
        output.append("The factorial of "+x+" is: "+out+"\n");
        for(int i=1; i < n; i++){
            out1 = out1 * (n - i);
        }
        output.append("The factorial of "+n+" is: "+out1+"\n");
        return output;
    }
}
