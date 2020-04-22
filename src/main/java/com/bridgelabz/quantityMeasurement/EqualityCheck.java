package com.bridgelabz.quantityMeasurement;

public class EqualityCheck {

    private final double value;
    private final Unit unitValue;

    public EqualityCheck(double value, Unit unitValue) {
        this.value = value * unitValue.getConvertedValue();
        this.unitValue = unitValue;
    }

    public static boolean compare(EqualityCheck value1, EqualityCheck value2)
            throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.
                    ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return value1.equals(value2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualityCheck EqualityCheck = (EqualityCheck) o;
        return Double.compare(EqualityCheck.value, value) == 0 ;
    }
}
