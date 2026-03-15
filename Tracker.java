import java.util.ArrayList;

public class Tracker {

    ArrayList<Problem> problems;
    ArrayList<Goal> goals;

    // Constructor
    public Tracker() {
        problems = new ArrayList<>();
        goals = new ArrayList<>();
    }

    // Add a new problem
    public void addProblem(Problem p) {
        problems.add(p);
        System.out.println("Problem added successfully!");
    }

    // View all problems
    public void viewProblems() {
        if(problems.isEmpty()) {
            System.out.println("No problems added yet.");
            return;
        }
        System.out.println("----- Solved Problems -----");
        for(Problem p : problems) {
            p.display();
        }
    }

    // Add a new goal
    public void addGoal(Goal g) {
        goals.add(g);
        System.out.println("Goal added successfully!");
    }

    // View all goals
    public void viewGoals() {
        if(goals.isEmpty()) {
            System.out.println("No goals set yet.");
            return;
        }
        System.out.println("----- Goals -----");
        for(Goal g : goals) {
            g.display();
        }
    }

    // Show progress
    public void showProgress() {
        System.out.println("----- Progress -----");
        System.out.println("Problems solved: " + problems.size());
        System.out.println("Goals set: " + goals.size());
    }
}
