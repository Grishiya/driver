package sky.pro.logAndPassword.domain;

public class TruckDriver extends Driver{
    public TruckDriver(String name, String passport, String driverLicense, int professions) {
        super(name, passport, driverLicense, professions);
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense != null && driverLicense.startsWith("2")) {
            super.setDriverLicense(driverLicense);
        }
    }
}
