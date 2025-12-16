import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AvlTree<Event> eventTree = new AvlTree<>();
        final ArrayDeque<Task> taskQueue = new ArrayDeque<>();

        int firstCommand = 0;
        System.out.println("Welcome, user! I am your calendar.");
        System.out.println("To start, here are some commands you can use. Type a number to execute one:");
        System.out.println("1. Add Event    2. View All Events    3. Search for Event    4. Delete Event    5. Tasks...    6. Exit");
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

                Event event = new Event(eventName, eventDate, eventLocation, eventNotes);
                eventTree.insert(event);
                System.out.println("Event added successfully!");

            } else if (firstCommand == 2) {
                System.out.println("Viewing all events...");
                // Further implementation for viewing events
                eventTree.printTree();
            } else if (firstCommand == 3) {
                //NOT WORKING RN
                System.out.println("Searching for an event...");
                // Further implementation for searching events (is there a way to search by title?)
                System.out.println("Please enter the title of the event you wish to search for.");
                String eventToSearch = scanner.next();
                eventTree.contains(eventToSearch);
                //Note: The contains method would need to be modified to search by title specifically.
                //extra: implement a method (prolly by overloading) that searches by date  

            } else if (firstCommand == 4) {
                //NOT WORKING RN
                System.out.println("Deleting an event...");
                // Further implementation for deleting events
                System.out.println("Please enter the title of the event you wish to delete.");
                String eventToDelete = scanner.next();

            } else if (firstCommand == 5) {
                System.out.println("Entering task management...");
                int taskCommand = 0;
                System.out.println("Here are some commands you can use for tasks! Type a number to execute one:");
                System.out.println("1. Add Task    2. View All Tasks    3. Mark Next Task as Completed    4. Delete Next Task    5. Exit Task Management");
                taskCommand = scanner.nextInt();

                while (true) {
                    if (taskCommand == 1) {
                        System.out.println("Adding a task...");
                        System.out.println("What would you like to name your task?");
                        String taskTitle = scanner.next();
                        System.out.println("When is the due date for your task?");
                        String taskDueDate = scanner.next();

                        Task task = new Task(taskTitle, taskDueDate);
                        taskQueue.addLast(task);
                        System.out.println("Task added successfully!");

                    } else if (taskCommand == 2) {
                        System.out.println("Viewing all tasks...");
                        // for (Task t : taskQueue) {
                        //     System.out.println(t);
                        // }
                        System.out.println(taskQueue);

                    } else if (taskCommand == 3) {
                        System.out.println("Marking next task as completed...");
                        if (!taskQueue.isEmpty()) {
                            Task nextTask = taskQueue.pollFirst();
                            nextTask.markCompleted();
                            System.out.println("Marked as completed: " + nextTask);
                        } else {
                            System.out.println("No tasks available to mark as completed.");
                        }

                    } else if (taskCommand == 4) {
                        System.out.println("Deleting next task...");
                        if (!taskQueue.isEmpty()) {
                            Task removedTask = taskQueue.pollFirst();
                            System.out.println("Deleted task: " + removedTask);
                        } else {
                            System.out.println("No tasks available to delete.");
                        }
                    } else if (taskCommand == 5) {
                        System.out.println("Exiting task management and returning to main menu...");
                        break;

                    } else {
                        System.out.println("Invalid command in task management. Please try again.");
                    }
                    
                    System.out.println("What would you like to do next in task management?");
                    taskCommand = scanner.nextInt();
                }
            }
            else if (firstCommand == 6) {
                System.out.println("Exiting the calendar. Goodbye!");
                // Exit the program
                scanner.close();
                return;

            } else {
                System.out.println("Invalid command. Please try again.");
            }
            
            firstCommand = 0;
            System.out.println("What would you like to do next in the main menu?");
            firstCommand = scanner.nextInt();
        }
    }
}
