package org.example.View;

import org.example.Model.CalculatorLogic;
import org.example.Model.ComplexCalculator;

import java.util.Scanner;


public class CalculatorService {
    protected CalculatorLogic logic;
    protected Scanner scanner;

    public CalculatorService(CalculatorLogic logic) {
        scanner = new Scanner(System.in);
        this.logic = logic;
    }

    public ComplexCalculator getComplexNumber() {
        System.out.print("Enter the complex number [a + bi]: ");
        String number = scanner.nextLine().trim();
        while (!isValidComplexNumber(number)) {
            System.out.print("Enter the complex number: ");
            number = scanner.nextLine().trim();
        }
        double numberValid = logic.parseRealPart(number);
        double numberImaginary = logic.parseImaginaryPart(number);
        return new ComplexCalculator(numberValid, numberImaginary);
    }

    public boolean isValidComplexNumber(String number) {
        String complexNumberPattern = "-?\\d+(\\.\\d+)?\\s*[+-]\\s*\\d+(\\.\\d+)?[iI]";

        if (number.matches(complexNumberPattern)) return true;
        else {
            System.out.println("Incorrect format complex number.");
            return false;
        }
    }
}