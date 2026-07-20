import java.util.PriorityQueue;

public class PriorityScheduler implements Scheduler {

    private PriorityQueue<Task> tasks;

    public PriorityScheduler() {
        tasks = new PriorityQueue<>();
    }

    @Override
    public void addTask(Task task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTask'");
    }

    @Override
    public Task executeTask() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executeTask'");
    }

    @Override
    public void displayTasks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayTasks'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int getTaskCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTaskCount'");
    }

}