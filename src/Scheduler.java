public interface Scheduler {

    // Add a new task
    void addTask(Task task);

    // Execute the next task
    Task executeTask();

    // Display all tasks
    void displayTasks();

    // Check if scheduler is empty
    boolean isEmpty();

    // Return number of tasks
    int getTaskCount();
}