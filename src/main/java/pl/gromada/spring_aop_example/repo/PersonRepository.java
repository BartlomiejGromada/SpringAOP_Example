package pl.gromada.spring_aop_example.repo;

import org.springframework.stereotype.Component;
import pl.gromada.spring_aop_example.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository implements GenericRepo<String, Person> {

    private List<Person> people;

    public PersonRepository() {
        this.people = new ArrayList<>();
    }

    @Override
    public Person get(String key) {
        if (key.length() != 11)
            throw new IllegalArgumentException("Personal Identity Number have to have 11 chars.");

        return people.stream().
                filter(p -> p.getPersonalIdentityNumber().equals(key))
                .findFirst()
                .get();
    }

    @Override
    public void add(Person element) {
        this.people.add(element);
    }
}
