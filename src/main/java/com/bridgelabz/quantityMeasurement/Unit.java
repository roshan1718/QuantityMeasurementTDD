package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12), INCH(1), YARD(36);

    public final double value;

    Unit(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
