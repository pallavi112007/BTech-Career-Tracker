public class Goal {

    String goalText;  // Description of the goal

    // Constructor to create a new Goal
    public Goal(String goalText) {
        this.goalText = goalText;
    }

    // Method to display goal
    public void display() {
        System.out.println("Goal: " + goalText);
    }
}