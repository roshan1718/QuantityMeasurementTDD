package com.bridgelabz.quantityMeasurement;

public class QuantityMeasurement {

        public double value;
        public TypeOfUnit type;

        public QuantityMeasurement(Double value, Unit unit) {
            this.value = unit.convertToBaseValue(value, unit);
            this.type = unit.type;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement QuantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(QuantityMeasurement.value, value) == 0 ;
    }
}
