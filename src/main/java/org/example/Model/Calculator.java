package org.example.Model;

public interface Calculator {
    ComplexCalculator Sum(ComplexCalculator num1, ComplexCalculator num2);
    ComplexCalculator Subtraction(ComplexCalculator num1, ComplexCalculator num2);
    ComplexCalculator Multiplication(ComplexCalculator num1, ComplexCalculator num2);
    ComplexCalculator Division(ComplexCalculator num1, ComplexCalculator num2);
}