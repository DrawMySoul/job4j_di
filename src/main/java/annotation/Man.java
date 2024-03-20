package annotation;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Man {
    @Autowired
    private Dog dog;

    @Resource(name = "someDog")
    private Dog dog1;
    private Cat cat;
    private Bird bird;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet> mapDogs;


    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void setDogs(List<Pet<Dog>> dogs) {
        this.dogs = dogs;
    }

    public void setMapDogs(Map<String, Pet> mapDogs) {
        this.mapDogs = mapDogs;
    }

    public void print() {
        System.out.printf("My dog: %s%n", dog.print());
        System.out.printf("My secondDog: %s%n", dog1.print());
        System.out.printf("My cat: %s%n", cat.print());
        System.out.printf("My bird: %s%n", bird.print());
        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapDogs.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }
}
