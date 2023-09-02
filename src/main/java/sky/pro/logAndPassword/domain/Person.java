package sky.pro.logAndPassword.domain;

public class Person {
    private String name;
    private String passport;

    public Person(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void checkPassportNumber(String passport) {
        if (passport != null && !passport.isBlank()) {
            this.passport=passport;
        }
    }
}
