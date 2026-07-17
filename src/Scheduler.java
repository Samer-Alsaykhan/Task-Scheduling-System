public interface Scheduler {

    void addTask(Task task);

    void executeTasks();

    void displayTasks();

}