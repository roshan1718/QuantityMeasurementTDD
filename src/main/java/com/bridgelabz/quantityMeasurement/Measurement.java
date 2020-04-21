package com.bridgelabz.quantityMeasurement;

public class Measurement {


    public boolean compare(Unit value1, Unit value2) {
        if(value1.equals(value2))
            return true;
        return false;
    }
}
