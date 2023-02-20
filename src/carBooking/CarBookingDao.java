package carBooking;

import car.Car;

import java.util.Arrays;

public class CarBookingDao {
  private static CarBooking[] carBookings;

  public CarBooking[] getAllBookings(){
    return carBookings;
  }

}
