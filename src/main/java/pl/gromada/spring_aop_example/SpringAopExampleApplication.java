package pl.gromada.spring_aop_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.gromada.spring_aop_example.model.GENDER;
import pl.gromada.spring_aop_example.model.Person;
import pl.gromada.spring_aop_example.repo.GenericRepo;
import pl.gromada.spring_aop_example.repo.PersonRepository;

@SpringBootApplication
public class SpringAopExampleApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringAopExampleApplication.class, args);

        GenericRepo<String, Person> peopleRepo = ctx.getBean(PersonRepository.class);
        peopleRepo.add(new Person("97923674585", "Tomasz", "Kowalski", GENDER.MALE));
        peopleRepo.add(new Person("98456478234", "Monika", "Nowak", GENDER.FEMALE));
        System.out.println(peopleRepo.get("97923674585"));
        System.out.println(peopleRepo.get("98456478234"));

        System.out.println(peopleRepo.get("9845"));
    }

}
