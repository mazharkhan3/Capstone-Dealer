package carBooking;

public class CarBookingService {
  private CarBookingDao carBookingDao = new CarBookingDao();

  public CarBooking[] getAllBookings(){
    return carBookingDao.getAllBookings();
  }
}
