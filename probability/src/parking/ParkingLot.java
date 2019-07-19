package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int MINIMUM_NUMBER_OF_SLOTS = 1;
    private final int numberOfSlots;
    private final List<Car> parkedCars = new ArrayList<>();

    private ParkingLot(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public static ParkingLot create(int numberOfSlots) {
        if (numberOfSlots < MINIMUM_NUMBER_OF_SLOTS) {
            throw new InvalidParkingLotSpaceException();
        }
        return new ParkingLot(numberOfSlots);
    }

    public void park(Car car) {
        if (parkedCars.contains(car)) {
            throw new CarAlreadyParkedException();
        }

        if (parkedCars.size() == numberOfSlots) {
            throw new NoSpaceAvailableException();
        }

        parkedCars.add(car);

    }

    public boolean isParked(Car car) {
        return parkedCars.contains(car);
    }

    public void unpark(Car car) {
        if (!parkedCars.contains(car)) {
            throw new CarNotParkedException();
        }
        parkedCars.remove(car);
    }


}
