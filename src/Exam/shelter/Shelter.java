package Exam.shelter;

import java.util.List;

public class Shelter {
    private static List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        data = getData();
    }
    public int getCount(List<Animal> data){
        return data.size();
    }

    public static void addAnimal(int capacity, int animalCount, List<Animal> animalsInTheShelter, Animal animal) {
        if (animalCount < capacity){
            animalsInTheShelter.add(animal);
        }
    }
    public static void removeAnimal(List<Animal> animalsInTheShelter, Animal animal) {
        animalsInTheShelter.remove(animal);
    }
    public static void getAnimal(List<Animal> animalsInTheShelter, String animalInQuestion, String animalCaregiver, Animal animal) {
        if(animalsInTheShelter.contains(animal)){
            System.out.printf("%s, %s", animalInQuestion, animalCaregiver);
        }
    }

    public List<Animal> getData() {
        return data;
    }

    public void setData(List<Animal> data) {
        Shelter.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
