package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //TEST FOR FEET
    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new  EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void givenFeetValue_WhenNotEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(2.0, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }
    @Test
    public void givenNullValue_WhenNotEqual_ReturnFalse() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        try {
            boolean isEqual = EqualityCheck.compare(value1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
    @Test
    public void givenSameReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value1);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(12, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    //TEST FOR INCH
    @Test
    public void givenInchNull_WhenNotEqual_ReturnFalse() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        try {
            EqualityCheck.compare(value1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
    @Test
    public void givenSameInchReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value1);
        Assert.assertEquals(true, isEqual);
    }
    @Test
    public void givenSameInchType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void givenSameInchValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given0FeetAnd0Inch_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(0.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(0.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void givenFeetAndInch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }
    @Test
    public void given1FeetAnd12Inch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }

    // TEST FOR YARD
    @Test
    public void given3FeetAnd1Yard_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(3.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given1FeetAnd1Yard_WhenNotEquals_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }
    @Test
    public void given1InchAnd1Yard_WhenNotEquals_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }
    @Test
    public void given36InchAnd1Yard_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(36.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given1YardAnd36Inch_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.YARD);
        EqualityCheck value2 = new EqualityCheck(36.0, Unit.INCH);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }
    @Test
    public void given1YardAnd3Feet_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(3.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    //TEST FOR CENTIMETER
    @Test
    public void given2InchAnd5Centimeter_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(5.0, Unit.CENTIMETER);
        boolean isEqual = EqualityCheck.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    // TEST FOR ADDITION OF LENGTHS
    @Test
    public void givenInchAndInch_WhenGetAdded_ReturnResult()  {
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(2.0, Unit.INCH);
        double result = EqualityCheck.addition(value1, value2);
        Assert.assertEquals(4.0, result, 0);
    }
    @Test
    public void given1FeetAnd2Inch_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(2.0, Unit.INCH);
        double result = EqualityCheck.addition(value1, value2);
        Assert.assertEquals(14.0, result, 0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenGetAdded_ReturnResult(){
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
        double result = EqualityCheck.addition(value1, value2);
        Assert.assertEquals(24.0, result, 0);
    }
    @Test
    public void givenInchAndCentimeter_WhenGetAdded_ReturnResult(){
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(2.5, Unit.CENTIMETER);
        double result = EqualityCheck.addition(value1, value2);
        Assert.assertEquals(3, result, 0);
    }
    @Test
    public void givenGallonandLitres_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.GALLON);
        EqualityCheck value2 = new EqualityCheck(3.78, Unit.LITRE);
        double result = EqualityCheck.addition(value1, value2);
        Assert.assertEquals(7.56, result, 0);
    }
}
