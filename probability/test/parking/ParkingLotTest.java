package parking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void park_expectParkingTheCar_givenParkingLotHasSpaceAvailable() {
        Car car = new Car("1");
        ParkingLot parkingLot = ParkingLot.create(1);

        parkingLot.park(car);

        assertTrue(parkingLot.isParked(car));

    }

    @Test(expected = NoSpaceAvailableException.class)
    public void park_throwsNoSpaceAvailableException_givenParkingTheCarWhenParkingLotIsFull() {
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park(car1);

        parkingLot.park(car2);

    }

    @Test(expected = InvalidParkingLotSpaceException.class)
    public void park_throwsInvalidParkingLotSpaceException_givenParkingLotSpaceIsZero() {
        ParkingLot parkingLot = ParkingLot.create(0);
    }

    @Test(expected = CarAlreadyParkedException.class)
    public void park_returns1_givenAlreadyParkedCarIsTryingToParkInParkingLot() {
        Car car = new Car("1");
        ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park(car);

        parkingLot.park(car);

    }

    @Test
    public void unpark_expectsUnparkingACar_givenCarIsParkedInParkingLot() {
        Car car = new Car("1");
        ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park(car);

        parkingLot.unpark(car);

        assertFalse(parkingLot.isParked(car));

    }

    @Test(expected = CarNotParkedException.class)
    public void unpark_throwsCarNotParkedException_givenCarIsNotParkedInParkingLot() {
        Car car = new Car("1");
        ParkingLot parkingLot = ParkingLot.create(1);

        parkingLot.unpark(car);

    }

}