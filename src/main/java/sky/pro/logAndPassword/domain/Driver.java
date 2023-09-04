package sky.pro.logAndPassword.domain;

public class Driver extends Person {
    private String driverLicense;

    public Driver(String name, String passport, String driverLicense, int professions) {
        super(name, passport, professions);
        this.driverLicense = driverLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}
