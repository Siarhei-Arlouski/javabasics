import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstLesson firstLesson = new FirstLesson();
        firstLesson.variables();
        firstLesson.stringScanner();

        SecondLesson secondLesson = new SecondLesson();
        secondLesson.firstTask();
        secondLesson.secondTask();
        secondLesson.thirdTask();
        secondLesson.fourthTask();
        secondLesson.additionalTask();

        AdditionalTasks additionalTasks = new AdditionalTasks();
        additionalTasks.taskOne();
        additionalTasks.taskTwo();
        additionalTasks.taskThree();
        additionalTasks.taskFour();
        additionalTasks.taskFive();
        additionalTasks.taskSix();
        additionalTasks.taskSeven();
        additionalTasks.taskEight();
        additionalTasks.taskOneCycle();
        additionalTasks.taskTwoCycle();
        additionalTasks.taskThreeCycle();

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        additionalTasks.taskFourCycle(x);
        System.out.println(additionalTasks.taskFourCycle(x));

        additionalTasks.taskFiveCycle();
    }
}