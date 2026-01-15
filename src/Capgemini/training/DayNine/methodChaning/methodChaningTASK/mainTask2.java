package Capgemini.training.DayNine.methodChaning.TASK;

public class mainTask2 {

    public static void main(String[] args) {

        // task2 class ka object banaya
        task2 ob2 = new task2();

        // =========================
        // Method Chaining
        // =========================
        ob2.setName("Shashwat")
                .setAge(21)
                .setStudentClass(12);

        // =========================
        // Getter se data print
        // =========================
        System.out.println(ob2.getName());
        System.out.println(ob2.getAge());
        System.out.println(ob2.getStudentClass());
    }
}
