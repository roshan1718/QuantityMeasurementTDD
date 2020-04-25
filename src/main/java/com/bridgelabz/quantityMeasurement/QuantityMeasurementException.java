package com.bridgelabz.quantityMeasurement;

public class QuantityMeasurementException extends Exception {

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        UNIT_MISMATCH,NULL_VALUE_ENTERED,
        TEMPERATURE_CANNOT_ADD;
    }
}