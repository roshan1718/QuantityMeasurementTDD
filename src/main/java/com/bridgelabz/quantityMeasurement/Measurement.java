package com.bridgelabz.quantityMeasurement;

public class Measurement {


    public boolean compare(EqualityCheck value1, EqualityCheck value2)
                         throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return value1.equals(value2);
    }

}
