import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tracker tracker = new Tracker();
        TimerUtil timer = new TimerUtil();
        Resources resources = new Resources();

        System.out.println("===== Welcome to BTech Career Tracker =====");

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Solved Problem");
            System.out.println("2. View Problems");
            System.out.println("3. Set Goal");
            System.out.println("4. View Goals");
            System.out.println("5. Start Coding Timer");
            System.out.println("6. Show Resources");
            System.out.println("7. Exit");
            System.out.println("8. Show 4-Year Roadmap");
            System.out.println("9. Show Progress");
            System.out.println("10. Daily Reminder");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if(choice == 1) {
                System.out.print("Problem Name: ");
                String name = sc.nextLine();

                System.out.print("Topic: ");
                String topic = sc.nextLine();

                System.out.print("Difficulty: ");
                String difficulty = sc.nextLine();

                System.out.print("Platform: ");
                String platform = sc.nextLine();

                tracker.addProblem(new Problem(name, topic, difficulty, platform));
            }

            else if(choice == 2) {
                tracker.viewProblems();
            }

            else if(choice == 3) {
                System.out.print("Enter your goal: ");
                String goalText = sc.nextLine();

                tracker.addGoal(new Goal(goalText));
            }

            else if(choice == 4) {
                tracker.viewGoals();
            }

            else if(choice == 5) {
                System.out.print("Enter timer duration in minutes: ");
                int minutes = sc.nextInt();
                sc.nextLine(); // consume newline

                timer.startTimer(minutes);
            }

            else if(choice == 6) {
                resources.showResources();
            }

            else if(choice == 7) {
                System.out.println("Exiting... Good luck with your BTech journey!");
                break;
            }

            else if(choice == 8) {
                resources.showRoadmap();
            }

            else if(choice == 9) {
                tracker.showProgress();
            }

            else if(choice == 10) {
                System.out.println("Reminder: Practice at least 1 coding problem today!");
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

       