package org.example;

import org.example.Contoller.CalculatorController;
import org.example.Logger.CalculatorLogger;
import org.example.Model.Calculator;
import org.example.Model.CalculatorLogic;
import org.example.Model.ComplexCalculator;
import org.example.View.CalculatorService;
import org.example.View.CalculatorView;

public class Main {
    public static void main(String[] args) {


        CalculatorController controller = new CalculatorController();
        controller.start();
    }
}