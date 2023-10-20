package org.example.Model;

public class ComplexCalculator {
    protected Double numberValid;
    protected Double numberImaginary;

    public ComplexCalculator(Double numberValid, Double numberImaginary) {
        this.numberValid = numberValid;
        this.numberImaginary = numberImaginary;
    }

    public Double getNumberValid() {
        return numberValid;
    }

    public Double getNumberImaginary() {
        return numberImaginary;
    }

    @Override
    public String toString() {
        return numberValid + " + " + numberImaginary + "i";
    }
}