package car;

import java.util.Arrays;

public class CarDao {
  private static final Car[] cars;

  static {
    cars = new Car[]{
            new Car("1", 89.00, Brand.TESLA, true),
            new Car("2", 50.00, Brand.AUDI, false),
            new Car("3", 77.00, Brand.MERCEDES, false),
    };
  }

  public Car[] getElectricCars() {
    return Arrays.stream(cars).filter(x -> x.isElectric() == true).toArray(Car[]::new);
  }
}
