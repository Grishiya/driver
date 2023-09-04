package sky.pro.logAndPassword.example;

import org.springframework.stereotype.Service;
import sky.pro.logAndPassword.domain.Driver;
import sky.pro.logAndPassword.domain.Person;
import sky.pro.logAndPassword.domain.TruckDriver;
import sky.pro.logAndPassword.exception.BadPersonNumberException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345",
            new Person("Жан",
                    "12345",
                    0),
            "54321",
            new Person(
                    "Luk",
                    "54321",
                    2),
            "41232",
            new Person(
                    "Jerar",
                    "41232",
                    3),
            "92837",
            new Driver("Jason",
                    "92837",
                    "3491",
                    1),
            "23456",
            new TruckDriver(
                    "Robert",
                    "23456",
                    "2345",
                    2)

    ));

    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }

    List<String> professions = List.of(
            "not working",
            "driver",
            "plotnik",
            "stolyar",
            "актер"
    );


    @Override
    public String getPersonByPassport(String passport) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человека с такпим паспортом нет");
        }
        final String personDescription = " "
                + person.getName() +
                " "
                + person.getPassport() +
                " "
                + getProfessionsNames(person.getProfessions());

        return personDescription;

    }

    private String getProfessionsNames(List<Integer> professionsNumbers) {
        String result = "";
        for (Integer professionsNumber : professionsNumbers) {
            result = result + " " + professions.get(professionsNumber);
        }
        return result;
    }
}
