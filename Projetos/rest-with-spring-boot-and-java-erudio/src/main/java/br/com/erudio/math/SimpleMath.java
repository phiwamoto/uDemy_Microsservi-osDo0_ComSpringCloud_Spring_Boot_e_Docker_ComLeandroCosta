package br.com.erudio.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }
    
    public Double subtraction(Double numberOne, Double numberTwo) throws Exception {
        return numberOne - numberTwo;
    }
    
    public Double multiplication(Double numberOne, Double numberTwo) throws Exception {
        return numberOne * numberTwo;
    }   
    
    public Double division(Double numberOne, Double numberTwo) throws Exception {
        return numberOne / numberTwo;
    }
    
    public Double average(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo) / 2;
    }        
    
    public Double squareRoot(Double numberOne) throws Exception {
        return Math.sqrt(numberOne);
    }   
}
