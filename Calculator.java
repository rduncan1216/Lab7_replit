//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Lab 7

//Calculator class implements ICalcOp and defines setters, getters, and constructors

public class Calculator implements ICalcOp {

    private double num1;
    private double num2;
    private String operation = " ";
    private double results = 0;

    public Calculator(){
        num1 = 0;
        num2 = 0;
    }

    public Calculator(double a, double b){
        num1 = a;
        num2 = b;
    }

    @Override
    public double addition(){
        double sum = num1 + num2;
        results = sum;
        operation = "ADDITION";

        return sum;
    }

    @Override
    public double subtraction(){
        double difference = num1 - num2;
        results = difference;
        operation = "SUBTRACTION";

        return difference;
    }

    @Override
    public double multiplication(){
        double product = num1 * num2;
        results = product;
        operation = "MULTIPLICATION";

        return product;
    }

    @Override
    public double division(){
        double quotient = num1/num2;
        results = quotient;
        operation = "DIVISION";

        return quotient;
    }

    @Override
    public String toString(){
        return "First Number: " + num1 + "\nSecond Number: " + num2 + "\nResult: " + results + "\nOperation: " + operation;
    }

    public void setNum1(double a){
        num1 = a;
    }

    public void setNum2(double a){
        num2 = a;
    }

    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    public double getResults(){
        return results;
    }
}
