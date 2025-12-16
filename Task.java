public class Task {
    private String title;
    private String dueDate;
    private boolean isCompleted;

    Task(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    boolean markCompleted() {
        this.isCompleted = true;
        return this.isCompleted;
    }

    @Override
    public String toString() {
        return String.format("Task[%s] due by %s (%s)", title, dueDate, isCompleted ? "completed" : "not completed");
    }
}