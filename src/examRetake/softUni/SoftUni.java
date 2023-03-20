package examRetake.softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    //getCount() method – returns the number of students in the course
    public int getCount() {
        return data.size();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public String insert(Student student) {
        String message;
        if (data.size() >= capacity) {
            message = "The hall is full.";
        } else if (getData().contains(student)){
            message = "Student is already in the hall.";
        } else {
            data.add(student);
            message = String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
        }
        return message;
    }

    public String remove(Student student){
        String message;

        if(!data.contains(student)){
            message = "Student not found.";
        } else {
            data.remove(student);
            message = String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
        }

        return message;
    }

    public Student getStudent(String firstName, String lastName) {
        Student studentToGet = null;
        for (Student student : data){
            String name = student.getFirstName();
            String familyName = student.getLastName();
            if (name.equals(firstName) && familyName.equals(lastName)){
                studentToGet = student;
            }
        }
        return studentToGet;
    }

    public String getStatistics() {

        StringBuilder statistics = new StringBuilder();
        statistics.append(String.format("Hall size: %d%n", data.size()));
        for (Student student : data){
            statistics.append(String.format("Student: %s %s, Best Course = %s%n", student.getFirstName(), student.getLastName(), student.getBestCourse()));
        }

        return statistics.toString();
    }

}
