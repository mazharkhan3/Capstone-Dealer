package car;

import carBooking.CarBookingDao;

public class CarService {
  private CarDao carDao = new CarDao();
  private CarBookingDao carBookingDao = new CarBookingDao();

  public Car[] getAvailableElectricCars(){
//    var electricCars = carDao.getElectricCars();
//
//    return carBookingDao.getAvailableElectricCars(electricCars);
    return carDao.getElectricCars();
  }
}
