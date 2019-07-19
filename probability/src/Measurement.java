public class Measurement {
    private double value;
    private Unit unit;

    public Measurement(double distance, Unit unit) {
        this.value = distance;
        this.unit = unit;
    }


    private boolean isEquals(Measurement anotherMeasurement) {
        return this.value == anotherMeasurement.unit.convertTo(anotherMeasurement.value, this.unit);
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Measurement distance = (Measurement) anotherObject;

        return this.isEquals(distance);
    }


    @Override
    public String toString() {
        return value+" "+unit;
    }
}
