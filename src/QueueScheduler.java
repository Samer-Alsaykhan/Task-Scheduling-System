import java.util.LinkedList;
import java.util.Queue;

public class QueueScheduler implements Scheduler {

    private Queue<Task> queue = new LinkedList<>();

    @Override
    public void addTask(Task task) {
        queue.offer(task);
    }

    @Override
    public Task executeTask() {
        if (queue.isEmpty()) {
            System.out.println("No tasks to execute.");
            return null;
        }

        return queue.poll();
    }

    @Override
    public void displayTasks() {
        if (queue.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : queue) {
            System.out.println(task);
        }
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int getTaskCount() {
        return queue.size();
    }
}