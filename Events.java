import java.util.Scanner;

public class Events implements Comparable<Events> {
    private String title;
    private String date;
    private String location;
    private String notes;

    public Events(String title, String date, String location, String notes) {
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
    public int compareTo(Events other) {
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AvlTree<Events> eventTree = new AvlTree<>();

        int firstCommand = 0;
        System.out.println("Welcome, user! I am your calendar.");
        System.out.println("To start, here are some commands you can use. Type a number to execute one:");
        System.out.println("1. Add Event    2. View All Events    3. Search for Event    4. Delete Event    5. Exit");
        firstCommand = scanner.nextInt();

        while (true) {
            if (firstCommand == 1) {
                System.out.println("Adding an event...");
                // Further implementation for adding an event
                System.out.println("What would you like to name your event?");
                String eventName = scanner.next();
                System.out.println("When is your event?");
                String eventDate = scanner.next();
                System.out.println("Where is your event? If you don't have a location, type N/A.");
                String eventLocation = scanner.next();
                System.out.println("Are there any notes you would like to add to your event? If not, type N/A.");
                String eventNotes = scanner.next();

                Events event = new Events(eventName, eventDate, eventLocation, eventNotes);
                eventTree.insert(event);
                System.out.println("Event added successfully!");

            } else if (firstCommand == 2) {
                System.out.println("Viewing all events...");
                // Further implementation for viewing events
                eventTree.printTree();
            } else if (firstCommand == 3) {
                System.out.println("Searching for an event...");
                // Further implementation for searching events (is there a way to search by title?)
                System.out.println("Please enter the title of the event you wish to search for.");
                String eventToSearch = scanner.next();
                //System.out.println(eventTree.contains(eventToSearch));
                //Note: The contains method would need to be modified to search by title specifically.
                //talk to leanne about this and 4

            } else if (firstCommand == 4) {
                System.out.println("Deleting an event...");
                // Further implementation for deleting events
                System.out.println("Please enter the title of the event you wish to delete.");
                String eventToDelete = scanner.next();

            } else if (firstCommand == 5) {
                System.out.println("Exiting the calendar. Goodbye!");
                // Exit the program
                scanner.close();
                return;

            } else {
                System.out.println("Invalid command. Please try again.");
            }
            
            firstCommand = 0;
            System.out.println("What would you like to do next?");
            firstCommand = scanner.nextInt();
        }
    }
}

