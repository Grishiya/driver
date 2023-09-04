package sky.pro.logAndPassword.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String passport;
    private List<Integer> professions;


    public Person(String name, String passport, int professions) {
        this.name = name;
        this.passport = passport;
        this.professions = new ArrayList<>(List.of(professions));
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
            this.passport = passport;
        }
    }

    public List<Integer> getProfessions() {
        return professions;
    }
}

