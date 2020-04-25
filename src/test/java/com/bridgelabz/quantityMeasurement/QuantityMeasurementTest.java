package com.bridgelabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    Opration opration = new Opration();
    //TEST FOR FEET
    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        String result = opration.compare(value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenFeetValue_WhenNotEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(2.0, Unit.FEET);
        String result = opration.compare(value1, value2);
        Assert.assertEquals("not equal", result);
    }
    @Test
    public void givenNullValue_WhenNotEqual_ReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(0.0, Unit.FEET);
        try {
            String result = opration.compare( value1, null);
            Assert.assertEquals("not equal", result);
        } catch ( QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }
    @Test
    public void givenSameReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        String result = opration.compare( value1, value1);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        String result = opration.compare(value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.FEET);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);

    }

    //TEST FOR INCH
    @Test
    public void givenInchNull_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(0.0, Unit.INCH);
        try {
            String result = opration.compare( value1, null);
            Assert.assertEquals("not equal", result);
        } catch ( QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, e.type);
        }
    }
    @Test
    public void givenSameInchReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        String result = opration.compare( value1, value1);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenSameInchType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenSameInchValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given0FeetAnd0Inch_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(0.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenFeetAndInch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("not equal", result);
    }
    @Test
    public void given1FeetAnd12Inch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("not equal", result);
    }

    // TEST FOR YARD
    @Test
    public void given3FeetAnd1Yard_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given1FeetAnd1Yard_WhenNotEquals_ReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("not equal", result);
    }
    @Test
    public void given1InchAnd1Yard_WhenNotEquals_ReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("not equal", result);
    }
    @Test
    public void given36InchAnd1Yard_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given1YardAnd36Inch_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.YARD);
        QuantityMeasurement value2 = new QuantityMeasurement(36.0, Unit.INCH);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void given1YardAnd3Feet_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }

    //TEST FOR CENTIMETER
    @Test
    public void given2InchAnd5Centimeter_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(5.0, Unit.CENTIMETER);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }

    // TEST FOR ADDITION OF LENGTHS
    @Test
    public void givenInchAndInch_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement result = opration.addition(value1,value2,Unit.INCH);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(4.0, Unit.INCH);
        Assert.assertEquals(expectedvalue, result);
    }
    @Test
    public void given1FeetAnd2Inch_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.INCH);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(14.0, Unit.INCH);
        Assert.assertEquals(expectedvalue, result);
    }
    @Test
    public void given1FeetAnd1Feet_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.INCH);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(24.0, Unit.INCH);
        Assert.assertEquals(expectedvalue, result);
    }
    @Test
    public void givenInchAndCentimeter_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(2.5, Unit.CENTIMETER);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.INCH);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(3.0, Unit.INCH);
        Assert.assertEquals(expectedvalue, result);
    }

    //TEST FOR VOLUMES IN GALLON, LITRE AND ML
    @Test
    public void givenGallonAndLitres_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.GALLON);
        QuantityMeasurement value2 = new QuantityMeasurement(3.78, Unit.LITRES);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.LITRES);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(7.56, Unit.LITRES);
        Assert.assertEquals(expectedvalue, result);
    }
    @Test
    public void givenLitreAndML_WhenGetAdded_ReturnResult() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.LITRES);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.MILLILITERS);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.LITRES);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(2.0, Unit.LITRES);
        Assert.assertEquals(expectedvalue, result);
    }
    @Test
    public void givenGallonAndLitre_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.GALLON);
        QuantityMeasurement value2 = new QuantityMeasurement(3.78, Unit.LITRES);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenLitreAndMl_WhenEquals_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.LITRES);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.MILLILITERS);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }

    //TEST FOR KILOGRAMS,GRAMS AND TONNE
    @Test
    public void givenKgAndGm_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.KILOGRAMS);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.GRAMS);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenTonneAndkgs_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.TONNE);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.KILOGRAMS);
        String result = opration.compare( value1, value2);
        Assert.assertEquals("equal", result);
    }
    @Test
    public void givenTonneAndGm_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.TONNE);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.GRAMS);
        QuantityMeasurement result = opration.addition(value1,value2, Unit.TONNE);
        QuantityMeasurement expectedvalue = new QuantityMeasurement(1001.0, Unit.TONNE);
        Assert.assertEquals(expectedvalue, result);
    }
    //TEST FOR TEMPERATURE
    @Test
    public void givenTemperature_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value1 = new QuantityMeasurement(212.0, Unit.FAHRENHEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(100.0, Unit.CELSIUS);
        Assert.assertEquals(value1.value, 100.0, 0.0);
        Assert.assertEquals(value2.value, 212.0, 0.0);
    }

    @Test
    public void givenFeetAndGram_WhenNotEqual_ReturnFalse() {
        try {
            QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
            QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.GRAMS);
            opration.compare( value1, value2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_MISMATCH, e.type);
        }

    }
    @Test
    public void givenInchAndKG_WhenNotEqual_ReturnFalse() {
        try {
            QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.INCH);
            QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.KILOGRAMS);
            opration.compare( value1, value2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_MISMATCH, e.type);
        }
    }
    @Test
    public void givenFeetAndGallone_WhenNotEqual_ReturnFalse() {
        try {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(3.78, Unit.GALLON);
        opration.compare( value1, value2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_MISMATCH, e.type);
        }
    }
    @Test
    public void givenTemperature_WhenAdded_ReturnTrue() {
        try {
            QuantityMeasurement value1 = new QuantityMeasurement(212.0, Unit.FAHRENHEIT);
            QuantityMeasurement value2 = new QuantityMeasurement(100.0, Unit.CELSIUS);
            opration.addition(value1,value2, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.TEMPERATURE_CANNOT_ADD, e.type);
        }

    }
}
