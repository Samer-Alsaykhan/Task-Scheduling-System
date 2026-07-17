public class Task {

    private int id;
    private String title;
    private int priority;
    private int arrivalOrder;

    public Task(int id, String title, int priority, int arrivalOrder) {
        this.id = id;
        this.title = title;
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
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Task)) return false;

    Task other = (Task) obj;

    return id == other.id;
}
@Override
public int hashCode() {
    return Integer.hashCode(id);
}