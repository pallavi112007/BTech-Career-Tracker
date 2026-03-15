public class Problem {

    String name;       // Problem name
    String topic;      // Topic (Stack, Array, Graph...)
    String difficulty; // Difficulty (Easy, Medium, Hard)
    String platform;   // Platform (LeetCode, HackerRank...)

    // Constructor to create a new Problem
    public Problem(String name, String topic, String difficulty, String platform) {
        this.name = name;
        this.topic = topic;
        this.difficulty = difficulty;
        this.platform = platform;
    }

    // Method to display problem details
    public void display() {
        System.out.println(
            "Problem: " + name + 
            " | Topic: " + topic + 
            " | Difficulty: " + difficulty + 
            " | Platform: " + platform
        );
    }
}