import java.util.List;

public enum Unit {
    CENTIMETER(100000, UnitType.DISTANCE),
    METER(1000, UnitType.DISTANCE),
    KILOMETER(1, UnitType.DISTANCE ) ,
    KILOGRAM(1,UnitType.WEIGHT),
    GRAM(1000,UnitType.WEIGHT);

    private int factor;
    private UnitType type;

    Unit(int factor,UnitType type) {
        this.factor = factor;
        this.type = type;
    }


    public double convertTo(double value, Unit anotherUnit) {
        if(this.type!=anotherUnit.type) {
            throw new IllegalArgumentException("Incompatible unit types.");
        }
        return (value  * anotherUnit.factor)/ this.factor;
    }
}
