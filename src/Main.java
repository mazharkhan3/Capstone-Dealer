import car.CarService;
import carBooking.CarBookingService;
import user.UserService;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class Main {
  private static UserService userService = new UserService();
  private static CarService carService = new CarService();
  private static CarBookingService carBookingService = new CarBookingService();

  public static void main(String[] args) {
    boolean flag = true;

    while (flag) {
      try {
        displayMenu();

        Scanner scanner = new Scanner(System.in);

        var selectedNumber = Integer.parseInt(scanner.next());

        switch (selectedNumber) {
          case 1:
            break;
          case 2:
            break;
          case 3:
            var bookings = carBookingService.getAllBookings();
            if(bookings == null){
              System.out.println("No bookings available 🥲");
            }else {
              System.out.println(Arrays.toString(bookings));
            }
            break;
          case 4:
            break;
          case 5:
            System.out.println(Arrays.toString(carService.getAvailableElectricCars()));
            break;
          case 6:
            System.out.println(Arrays.toString(userService.getUsers()));
            break;
          case 7:
            flag = false;
            break;
          default:
            System.out.println(selectedNumber + " is an invalid selection. Please select a number specified in the menu");
        }
      } catch (NumberFormatException e) {
        System.out.println("Input must be a number.");
      }
    }
  }

  private static void displayMenu() {
    System.out.println("1️⃣ - Book Car");
    System.out.println("2️⃣ - View All User Booked Cars");
    System.out.println("3️⃣ - View All Bookings");
    System.out.println("4️⃣ - View Available Cars");
    System.out.println("5️⃣ - View Available Electric Cars");
    System.out.println("6️⃣ - View all Users");
    System.out.println("7️⃣ - Exit");
  }
}