package sky.pro.logAndPassword.example;

import sky.pro.logAndPassword.domain.Driver;
import sky.pro.logAndPassword.domain.TruckDriver;

public class PolymorphismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver(
                "Max",
                "123",
                "2234");
        driver.setDriverLicense("1345");
        System.out.println("driver.getDriverLicense() = " + driver.getDriverLicense());
    }
}
