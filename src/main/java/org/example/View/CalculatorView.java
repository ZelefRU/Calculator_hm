package org.example.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorView {

    public CalculatorView() {}

    /**
     * Вывод меню действий для калькулятора
     */
    public void showActionMenu() {
        System.out.println("""
                1. Sum of numbers
                2. Subtracting numbers
                3. Multiplying numbers
                4. Dividing numbers
                
                5. [Close]
                """);
    }

    /**
     * Получение выбранного пункта меню. Включает в себя проверки на валидность.
     * @return Число int
     */
    public int getActionMenuChoose() {
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        while (true) {
            try {
                System.out.print("Input number: ");
                userChoice = scanner.nextInt();

                if (userChoice >= 1 && userChoice <= 5) {
                    return userChoice;
                } else {
                    System.out.println("Incorrect menu action! Input numbers 1-5!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Your input is not a valid number");
                scanner.next();
            }
        }
    }

    /**
     * Выводим результат вычислений.
     * @param op Операция (Сложение/Вычитание/Умножение/Деление)
     * @param result Результат в float
     */
    public void showOperationResult(String op, Object result) {
        System.out.printf("""
                Result of %s operation is %s.\s
                
                """, op, result.toString());
    }
}