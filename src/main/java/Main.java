import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository friends = new PersonRepository();
        friends.addNewEntry(new Person(123, "Horst", Gender.MASCULIN, DaysOfWeek.MONDAY));
        friends.addNewEntry(new Person(456, "Susanne", Gender.FEMININ, DaysOfWeek.FRIDAY));
        friends.addNewEntry(new Person(789, "Klaus Bärbel", Gender.DIVERS, DaysOfWeek.SUNDAY));
        friends.addNewEntry(new Person(234, "Brigitte", Gender.FEMININ, DaysOfWeek.FRIDAY));
        friends.addNewEntry(new Person(567, "Jesus Maria", Gender.DIVERS, DaysOfWeek.SUNDAY));

        Optional<Person> person;

        person = friends.getPersonById(123);
        if(person.isPresent()) {
            System.out.println(person.get().name() + " liebt " + person.get().favoriteDay());
        } else {
            System.out.println("Du hast keine Freunde mit dieser ID");
        }

        person = friends.getPersonById(456);
        if(person.isPresent()) {
            System.out.println(person.get().name() + " liebt " + person.get().favoriteDay().getWorkday());
        } else {
            System.out.println("Du hast keine Freunde mit dieser ID");
        }

        person = friends.getPersonById(789);
        if(person.isPresent()) {
            System.out.println(person.get().name() + " liebt " + person.get().favoriteDay().getWorkday());
        } else {
            System.out.println("Du hast keine Freunde mit dieser ID");
        }

        friends.genderCount();

        person = friends.getPersonByName("Brigitte");
        if(person.isPresent()) {
            System.out.println(person.get().name() + " ist dir bekannt");
        } else {
            System.out.println("Keiner deiner Freunde hat diesen Namen");
        }

        System.out.println(friends.getFriendByFavoriteDay(DaysOfWeek.FRIDAY));
    }
}
