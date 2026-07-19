import java.util.Objects;

public class Task {

    private final int id;
    private final String title;
    private final int priority;
    private final int arrivalOrder;

    public Task(int id, String title, int priority, int arrivalOrder) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty.");
        }

        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException(
                    "Priority must be between 1 and 5."
            );
        }

        if (arrivalOrder < 0) {
            throw new IllegalArgumentException(
                    "Arrival order cannot be negative."
            );
        }

        this.id = id;
        this.title = title.trim();
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    @Override
    public String toString() {
        return String.format(
                "Task ID: %d | Title: %s | Priority: %d | Arrival: %d",
                id,
                title,
                priority,
                arrivalOrder
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Task)) {
            return false;
        }

        Task other = (Task) obj;

        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}