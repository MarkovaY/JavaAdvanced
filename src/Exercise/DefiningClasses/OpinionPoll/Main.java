package Exercise.DefiningClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading how many people we will be given
        int countPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < countPeople; i++) {
            // Reading the data about each person
            String[] data = scanner.nextLine().split("\\s+");

            String name = data[0];
            int age = Integer.parseInt(data[1]);

            // Filtering people by age
            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        //Sorting people in ascending order and printing the results
        people.stream().sorted((left, right) -> left.getName().compareTo(right.getName())).forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));
    }
}