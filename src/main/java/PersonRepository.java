import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> personRepo = new ArrayList<>();

    public Optional<Person> getPersonById(int id) {
        for(Person person : personRepo) {
            if(person.id() == id){
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> getPersonByName(String name) {
        for(Person person : personRepo) {
            if(person.name().equals(name)){
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getFriendByFavoriteDay(DaysOfWeek dow) {
        List<Person> persons = new ArrayList<>();
        for(Person person : personRepo) {
            if (person.favoriteDay().equals(dow)) {
                persons.add(person);
            }
        }
        return persons;
    }

    public void addNewEntry(Person person) {
        personRepo.add(person);
    }

    public void genderCount() {
        int m = 0, w = 0, d = 0;
        for(Person person : personRepo) {
            switch(person.gender()) {
                case MASCULIN:
                    m++;
                    break;
                case FEMININ:
                    w++;
                    break;
                default:
                    d++;
                    break;
            }
        }
        System.out.println(m + " deiner Freunde sind " + Gender.MASCULIN.getGerman());
        System.out.println(w + " deiner Freunde sind " + Gender.FEMININ.getGerman());
        System.out.println(d + " deiner Freunde sind " + Gender.DIVERS.getGerman() + " oder haben es dir nicht verraten");

    }
}
