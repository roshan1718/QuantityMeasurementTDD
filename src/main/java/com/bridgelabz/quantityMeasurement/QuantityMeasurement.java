package com.bridgelabz.quantityMeasurement;

public class QuantityMeasurement {

    public double value;
    private final Unit unitValue;

    public QuantityMeasurement(double value, Unit unitValue) {
        this.value = value * unitValue.value;
        this.unitValue = unitValue;
    }

    public static boolean compare(QuantityMeasurement value1, QuantityMeasurement value2)
            throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.
                    ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return value1.equals(value2);
    }

    public static double addition(QuantityMeasurement value1, QuantityMeasurement value2) {
        return value1.value + value2.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement QuantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(QuantityMeasurement.value, value) == 0 ;
    }
}
