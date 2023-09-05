package sky.pro.logAndPassword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.logAndPassword.domain.Person;
import sky.pro.logAndPassword.example.PersonService;
import sky.pro.logAndPassword.exception.BadPersonNumberException;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }



    @GetMapping("/add")
    public String addPerson(@RequestParam("name") String name,
                            @RequestParam("passport") String passport,
                            @RequestParam("profession") Integer profession) {
        Person person = new Person(
                name,
                passport,
                profession
        );
        personService.addPerson(person);
        return "person";
    }

    @GetMapping("/profession")
    public String addProfessions(@RequestParam("passport") String passport,
                               @RequestParam("profession") Integer profession) {
       personService.addProfessionNumber(passport, profession);
        return "Профессия добавлена";
    }

    @GetMapping(path = "/person/by-passport")
    public String getPersonPassport(@RequestParam("passport") String passport) {
        return personService.getPersonByPassport(passport);

    }
}
