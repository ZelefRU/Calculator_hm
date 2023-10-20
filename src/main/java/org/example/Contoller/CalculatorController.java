package org.example.Contoller;

import org.example.Logger.CalculatorLogger;
import org.example.Model.Calculator;
import org.example.Model.CalculatorLogic;
import org.example.Model.ComplexCalculator;
import org.example.View.CalculatorService;
import org.example.View.CalculatorView;

public class CalculatorController {
    protected Calculator calculator;
    protected CalculatorService service;
    protected ComplexCalculator num1, num2;
    protected CalculatorView view;
    protected CalculatorLogger logger;

    public CalculatorController() {
        this.calculator = new CalculatorLogic();
        this.service = new CalculatorService(new CalculatorLogic());
        this.num1 = new ComplexCalculator(null, null);
        this.num2 = new ComplexCalculator(null, null);
        this.view = new CalculatorView();
        this.logger = new CalculatorLogger();
    }

    public void start() {
        boolean run = true;
        while(run) {
            view.showActionMenu();
            int choice = view.getActionMenuChoose();
            switch (choice) {
                case 1 -> AdditionOperation();
                case 2 -> SubtractionOperation();
                case 3 -> MultiplicationOperation();
                case 4 -> DivisionOperation();
                case 5 -> run = false;
            }
        }
    }

    public void AdditionOperation() {
        System.out.print("[1] ");
        ComplexCalculator num1 = service.getComplexNumber();
        System.out.print("[2] ");
        ComplexCalculator num2 = service.getComplexNumber();
        calculator.Sum(num1, num2);
        ComplexCalculator sum = calculator.Sum(num1, num2);
        String log = "Addition operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        view.showOperationResult("Addition", sum);
        logger.write(log);
    }

    public void SubtractionOperation() {
        System.out.print("[1] ");
        ComplexCalculator num1 = service.getComplexNumber();
        System.out.print("[2] ");
        ComplexCalculator num2 = service.getComplexNumber();
        calculator.Subtraction(num1, num2);
        ComplexCalculator sum = calculator.Subtraction(num1, num2);
        String log = "Subtraction operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        view.showOperationResult("Subtraction", sum);
        logger.write(log);
    }

    public void MultiplicationOperation() {
        System.out.print("[1] ");
        ComplexCalculator num1 = service.getComplexNumber();
        System.out.print("[2] ");
        ComplexCalculator num2 = service.getComplexNumber();
        calculator.Multiplication(num1, num2);
        ComplexCalculator sum = calculator.Multiplication(num1, num2);
        String log = "Multiplication operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        view.showOperationResult("Multiplication", sum);
        logger.write(log);
    }

    public void DivisionOperation() {
        System.out.print("[1] ");
        ComplexCalculator num1 = service.getComplexNumber();
        System.out.print("[2] ");
        ComplexCalculator num2 = service.getComplexNumber();
        calculator.Division(num1, num2);
        ComplexCalculator sum = calculator.Division(num1, num2);
        String log = "Division operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        view.showOperationResult("Division", sum);
        logger.write(log);
    }
}