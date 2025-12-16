public class Event implements Comparable<Event> {
    private String title;
    private String date;
    private String location;
    private String notes;

    public Event(String title, String date, String location, String notes) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Event Title: " + title + "\n" +
               "Date: " + date + "\n" +
               "Location: " + location + "\n" +
               "Notes: " + notes;
    }

    @Override
    public int compareTo(Event other) {
        return this.date.compareTo(other.date);
    }

    public String changeTitle(String newTitle) {
        this.title = newTitle;
        return this.title;
    }

    public String changeDate(String newDate) {
        this.date = newDate;
        return this.date;
    }

    public String changeLocation(String newLocation) {
        this.location = newLocation;
        return this.location;
    }

    public String changeNotes(String newNotes) {
        this.notes = newNotes;
        return this.notes;
    }
}
