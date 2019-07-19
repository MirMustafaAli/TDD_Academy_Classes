
import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {

    @Test
    public void equals_returnTrue_Given100CentimeterTo1Meter() {
        Measurement HundredCentimeter = new Measurement(100, Unit.CENTIMETER);
        Measurement OneMeter = new Measurement(1, Unit.METER);

        boolean result = HundredCentimeter.equals(OneMeter);

        assertTrue(result);
    }

    @Test
    public void equals_returnFalse_Given1MeterTo500Centimeter(){
        Measurement oneMeter = new Measurement( 1, Unit.METER);
        Measurement fiftyCentimeter = new Measurement( 50, Unit.CENTIMETER);

        boolean result = fiftyCentimeter.equals(oneMeter);

        assertFalse(result);
    }
    @Test
    public  void equals_returnFalse_Given1KilometerTo100000Centimeter(){
        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(100000, Unit.CENTIMETER);

        boolean result = thousandMeter.equals(oneKilometer);

        assertTrue(result);
    }

    @Test
    public  void equals_returnFalse_Given1KilometerTo5000Meter(){
        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement fiveThousandMeter = new Measurement(5000, Unit.METER);

        boolean result = fiveThousandMeter.equals(oneKilometer);

        assertFalse(result);
    }
    @Test
    public  void equals_returnTrue_Given1KilometerTo1000Meter(){
        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(1000, Unit.METER);

        boolean result = thousandMeter.equals(oneKilometer);

        assertTrue(result);
    }

    @Test
    public  void equals_returnTrue_Given1KiloKILOGRAMTo1000Gram(){
        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement thousandGram = new Measurement(1000, Unit.GRAM);

        boolean result = thousandGram.equals(oneKilogram);

        assertTrue(result);
    }


    @Test(expected = IllegalArgumentException.class)
    public  void equals_throwsIllegalArgumentException_whenComparing1GramTo1Centimeter(){
        Measurement oneCentimeter = new Measurement(1, Unit.CENTIMETER);
        Measurement oneGram = new Measurement(1, Unit.GRAM);

        oneCentimeter.equals(oneGram);

    }

    @Test
    public void equals_returnsTrue_Given100CelsiusAnd212Fahrenheit() {
        Measurement hundredCelsius = new Measurement(100,Unit.CELSIUS);
        Measurement twoHundredTwelveFahrenheit = new Measurement(212,Unit.FAHRENHEIT);

        assertEquals(hundredCelsius,twoHundredTwelveFahrenheit);

    }

    @Test
    public void equals_returnsTrue_Given212FahrenheitAnd100Celsius() {
        Measurement hundredCelsius = new Measurement(100,Unit.CELSIUS);
        Measurement twoHundredTwelveFahrenheit = new Measurement(212,Unit.FAHRENHEIT);

        assertEquals(twoHundredTwelveFahrenheit,hundredCelsius);

    }

    @Test
    public void equals_returnsTrue_Given0CelsiusAnd273Point15Kelvin() {
        Measurement zeroCelsius = new Measurement(0,Unit.CELSIUS);
        Measurement twoSeventyThreePointOneFiveFahrenheit = new Measurement(273.15,Unit.KELVIN);

        assertEquals(zeroCelsius,twoSeventyThreePointOneFiveFahrenheit);

    }

}