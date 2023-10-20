package org.example.Model;

public class CalculatorLogic implements Calculator {

    @Override
    public ComplexCalculator Sum(ComplexCalculator num1, ComplexCalculator num2) {
        double valid = num1.getNumberValid() + num2.getNumberValid();
        double imaginary = num1.getNumberImaginary() + num2.getNumberImaginary();
        return new ComplexCalculator(valid, imaginary);
    }

    @Override
    public ComplexCalculator Subtraction(ComplexCalculator num1, ComplexCalculator num2) {
        double valid = num1.getNumberValid() - num2.getNumberValid();
        double imaginary = num1.getNumberImaginary() - num2.getNumberImaginary();
        return new ComplexCalculator(valid, imaginary);
    }

    @Override
    public ComplexCalculator Multiplication(ComplexCalculator num1, ComplexCalculator num2) {
        double valid = num1.getNumberValid() * num2.getNumberValid() - num1.getNumberImaginary() * num2.getNumberImaginary();
        double imaginary = num1.getNumberValid() * num2.getNumberImaginary() + num1.getNumberImaginary() * num2.getNumberValid();
        return new ComplexCalculator(valid, imaginary);
    }

    @Override
    public ComplexCalculator Division(ComplexCalculator num1, ComplexCalculator num2) {
        double denominator = num2.getNumberValid() * num2.getNumberValid() + num2.getNumberImaginary() * num2.getNumberImaginary();
        if(denominator == 0) throw new ArithmeticException("Division by zero is impossible...");
        double valid = (num1.getNumberValid() * num2.getNumberValid() + num1.getNumberImaginary() * num2.getNumberImaginary()) / denominator;
        double imaginary = (num1.getNumberImaginary() * num2.getNumberValid() - num1.getNumberValid() * num2.getNumberImaginary()) / denominator;
        return new ComplexCalculator(valid, imaginary);
    }

    public double parseRealPart(String input) {
        String validPart = input.split("\\+")[0].trim();
        return Double.parseDouble(validPart);
    }

    public double parseImaginaryPart(String input) {
        String imaginaryPart = input.split("\\+")[1].replace("i", "").trim();
        return Double.parseDouble(imaginaryPart);
    }
}
