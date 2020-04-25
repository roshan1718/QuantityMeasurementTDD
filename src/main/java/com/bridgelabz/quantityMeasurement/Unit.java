package com.bridgelabz.quantityMeasurement;

public enum Unit {
    FEET(12.0, TypeOfUnit.LENGTH),
    INCH(1.0, TypeOfUnit.LENGTH),
    YARD(36.0, TypeOfUnit.LENGTH),
    CENTIMETER(0.4, TypeOfUnit.LENGTH),

    GALLON(3.78, TypeOfUnit.VOLUME),
    LITRES(1, TypeOfUnit.VOLUME),
    MILLILITERS(0.001, TypeOfUnit.VOLUME),

    KILOGRAMS(1.0, TypeOfUnit.WEIGHT),
    GRAMS(0.001, TypeOfUnit.WEIGHT),
    TONNE(1000, TypeOfUnit.WEIGHT),

    FAHRENHEIT(5.0 / 9.0, TypeOfUnit.TEMPERATURE),
    CELSIUS(9.0 / 5.0, TypeOfUnit.TEMPERATURE);


    Double baseValue;
    TypeOfUnit type;

    Unit(double baseValue, TypeOfUnit type) {
        this.baseValue = baseValue;
        this.type = type;
    }

    public Double convertToBaseValue(Double value, Unit unit) {
        switch (unit) {
            case FAHRENHEIT:
                return ((value - 32) * (baseValue));
            case CELSIUS:
                return ((value * (baseValue)) + 32);
            default:
                return value * baseValue;
        }
    }
}
