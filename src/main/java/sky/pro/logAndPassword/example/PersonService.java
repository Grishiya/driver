package sky.pro.logAndPassword.example;

import sky.pro.logAndPassword.domain.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);



    String getPersonByPassport(String passport);

    void addProfessionNumber(String passport, Integer profession);

//    List<PersonServiceImpl> addPerson(Person person);
}
