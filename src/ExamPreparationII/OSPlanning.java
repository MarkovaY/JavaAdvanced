package ExamPreparationII;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Contains all the tasks in a Stack
        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        // Contains all the threads in a Queue
        ArrayDeque<Integer> threads = new ArrayDeque<>();

        String taskInput = scanner.nextLine();

        Arrays.stream(taskInput.split(", ")).map(Integer::parseInt).forEach(tasks::push);

        String threadInput = scanner.nextLine();

        Arrays.stream(threadInput.split(" ")).map(Integer::parseInt).forEach(threads::offer);

        int endTask = Integer.parseInt(scanner.nextLine());

        int task = tasks.peek();
        int thread = threads.peek();

        while (task != endTask){

            //If the thread value is greater than or equal to the task value, the task and thread get removed

            if (thread >= task){
                tasks.pop();
            }
            //If the thread value is less than the task value, the thread gets removed, but the task remains
            threads.poll();

            task = tasks.peek();
            thread = threads.peek();
        }
        //Print end results
        System.out.printf("Thread with value %d killed task %d%n", threads.peek(), endTask);
        String threadsLeft = threads.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(threadsLeft);
    }
}