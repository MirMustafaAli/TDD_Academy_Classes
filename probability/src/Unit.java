import java.util.List;

public enum Unit {
    CENTIMETER(100000, UnitType.DISTANCE,0),
    METER(1000, UnitType.DISTANCE,0),
    KILOMETER(1, UnitType.DISTANCE,0) ,
    KILOGRAM(1,UnitType.WEIGHT,0),
    GRAM(1000,UnitType.WEIGHT,0),
    CELSIUS(5,UnitType.TEMPERATURE,0),
    FAHRENHEIT(9,UnitType.TEMPERATURE,32),
    KELVIN(5,UnitType.TEMPERATURE,273.15),
    ;

    private int factor;
    private UnitType type;
    private double intercept;

    Unit(int factor,UnitType type, double intercept) {
        this.factor = factor;
        this.type = type;
        this.intercept = intercept;
    }


    public double convertTo(double value, Unit anotherUnit) {
        if(this.type!=anotherUnit.type) {
            throw new IllegalArgumentException("Incompatible unit types.");
        }
        return ((value-intercept)  * anotherUnit.factor)/ this.factor + anotherUnit.intercept;
    }
}

