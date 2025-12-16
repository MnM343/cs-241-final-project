import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testEventCreation() {
        Event event = new Event("Meeting", "2024-07-01", "Office", "Discuss project status");
        assertEquals("Meeting", event.getTitle());
        assertEquals("2024-07-01", event.getDate());
        assertEquals("Office", event.getLocation());
        assertEquals("Discuss project status", event.getNotes());
    }

    @Test
    public void testEventComparison() {
        Event event1 = new Event("Event1", "2024-06-01", "Location1", "bleh");
        Event event2 = new Event("Event2", "2024-07-01", "Location2", "bleh");
        assertTrue(event1.compareTo(event2) < 0);
    }

    @Test
    public void testTaskCreation() {
        Task task = new Task("Finish report", "2024-06-30");
        assertEquals("Task[Finish report] due by 2024-06-30 (not completed)", task.toString());
    }

    @Test
    public void testTaskCompletion() {
        Task task = new Task("Finish report", "2024-06-30");
        assertTrue(task.markCompleted());
    }
}
