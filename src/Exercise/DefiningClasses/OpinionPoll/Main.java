package Exercise.DefiningClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < countPeople; i++) {

            String[] data = scanner.nextLine().split("\\s+");

            String name = data[0];
            int age = Integer.parseInt(data[1]);

            if (age > 30) {

                Person person = new Person(name, age);
                people.add(person);
            }
        }
        people.stream().filter(person -> person.getAge() > 30).sorted((left, right) -> left.getName().compareTo(right.getName())).forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));
    }
}