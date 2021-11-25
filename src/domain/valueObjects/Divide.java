package domain.valueObjects;


public class Divide extends Operation {

    @Override
    public Number solve(Number firstNumber, Number secondNumber) {
        double result = firstNumber.getValue() / secondNumber.getValue(); 
        return new Number(result);
    }

    @Override
    public String toString() {
        return "÷";
    }
    
}