package com.bridgelabz.quantityMeasurement;

import java.util.Objects;

public class Opration{

     public String compare(QuantityMeasurement value1, QuantityMeasurement value2) throws QuantityMeasurementException {
         if (value1 == null || value2 == null)
             throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED NULL VALUE");
         if (value1.type != value2.type)
             throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_MISMATCH, "TYPE MISMATCH");
         return !Objects.equals(value1, value2) ? "not equal" : "equal";
     }

     public QuantityMeasurement addition(QuantityMeasurement value1, QuantityMeasurement value2, Unit unitType) throws QuantityMeasurementException {
         if (value1 == null || value2 == null )
             throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED NULL VALUE");
         if ((value1.type != value2.type) ||(value1.type.equals(TypeOfUnit.TEMPERATURE) && value2.type.equals(TypeOfUnit.TEMPERATURE)))
             throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TEMPERATURE_CANNOT_ADD, "INVALID TYPES FOR ADDITION");
         return new QuantityMeasurement((value1.value + value2.value),unitType);
     }

 }