package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12), INCH(1),
    YARD(36), CENTIMETER(0.4),
    GALLON(3.78), LITRE(1);
    public final double value;

    Unit(double value) {
        this.value = value;
    }

    public double getConvertedValue() {
        return value;
    }
}
