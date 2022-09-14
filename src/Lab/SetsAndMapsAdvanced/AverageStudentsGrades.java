package Lab.SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int student = 0; student < input; student++) {

            String studentsPlusGrades = scanner.nextLine();
            String name = studentsPlusGrades.split(" ")[0];
            Double grade = Double.parseDouble(studentsPlusGrades.split(" ")[1]);

            if (!studentsGrades.containsKey(name)) {
                List<Double> currentStudentGrades = new ArrayList<>();
                currentStudentGrades.add(grade);
                studentsGrades.put(name, currentStudentGrades);
            } else {
                List<Double> currentGrades = studentsGrades.get(name);
                currentGrades.add(grade);
                studentsGrades.put(name, currentGrades);
            }
        }
        for (var entry : studentsGrades.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
            double average = getAverageGrade(entry);
            System.out.printf("(avg: %.2f)%n", average);
        }
    }

    private static double getAverageGrade(Map.Entry<String, List<Double>> entry) {
        double sum = 0;
        int count = entry.getValue().size();

        for (int i = 0; i < entry.getValue().size(); i++) {
            double currentGrade = entry.getValue().get(i);
            sum += currentGrade;
        }
        return sum / count;
    }
}