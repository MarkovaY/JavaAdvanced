package Exam.shelter;

import java.util.*;

import static Exam.shelter.Shelter.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumberOfAnimals = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        Shelter shelter = new Shelter(capacity);

        int animalCount = 0;
        List<Animal> animalsInTheShelter = new ArrayList<>();
        for (int i = 0; i < initialNumberOfAnimals; i++) {

            String[] animalData = scanner.nextLine().split("\\s+");

            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String caretaker = animalData[2];

            Animal animal = new Animal(name, age, caretaker);
            animalsInTheShelter.add(animal);
            animalCount++;

        }

        while (animalCount != capacity){

            String command = scanner.nextLine();
            String animalInQuestion = command.split(" ")[1];
            int ageAnimal = Integer.parseInt(command.split(" ")[2]);
            String animalCaregiver = command.split(" ")[3];
            Animal animal = new Animal(animalInQuestion, ageAnimal, animalCaregiver);
            switch (command){
                case "add":
                    addAnimal(capacity, animalCount, animalsInTheShelter, animal);
                    break;
                case "remove":
                    removeAnimal(animalsInTheShelter, animal);
                    break;
                case "getAnimal":
                    getAnimal(animalsInTheShelter, animalInQuestion, animalCaregiver, animal);
                    break;
                case "getOldestAnimal":

                    break;
                case"getCount":
                    shelter.getCount(animalsInTheShelter);
                    break;
                case "getStatistics":

                    break;
            }
        }
    }




}