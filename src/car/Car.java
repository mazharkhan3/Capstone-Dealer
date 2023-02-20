package car;

import java.util.Objects;

public class Car {
  private String regNumber;
  private double rentalPricePerDay;
  private Brand brand;
  private boolean isElectric;

  public Car(String regNumber, double rentalPricePerDay, Brand brand, boolean isElectric) {
    this.regNumber = regNumber;
    this.rentalPricePerDay = rentalPricePerDay;
    this.brand = brand;
    this.isElectric = isElectric;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public double getRentalPricePerDay() {
    return rentalPricePerDay;
  }

  public void setRentalPricePerDay(double rentalPricePerDay) {
    this.rentalPricePerDay = rentalPricePerDay;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public boolean isElectric() {
    return isElectric;
  }

  public void setElectric(boolean electric) {
    isElectric = electric;
  }

  @Override
  public String toString() {
    return "Car{" +
            "regNumber='" + regNumber + '\'' +
            ", rentalPricePerDay=" + rentalPricePerDay +
            ", brand=" + brand +
            ", isElectric=" + isElectric +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return Double.compare(car.rentalPricePerDay, rentalPricePerDay) == 0 && isElectric == car.isElectric && Objects.equals(regNumber, car.regNumber) && brand == car.brand;
  }

  @Override
  public int hashCode() {
    return Objects.hash(regNumber, rentalPricePerDay, brand, isElectric);
  }
}
