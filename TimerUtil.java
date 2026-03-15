public class TimerUtil {

    public void startTimer(int minutes) {
        System.out.println("Coding timer started for " + minutes + " minute(s). Focus and code!");

        int totalSeconds = minutes * 60;

        try {
            while (totalSeconds >= 0) {
                int displayMinutes = totalSeconds / 60;
                int displaySeconds = totalSeconds % 60;

                System.out.printf("Time Left: %02d:%02d\r", displayMinutes, displaySeconds);
                System.out.flush();

                Thread.sleep(1000); // wait 1 second
                totalSeconds--;
            }
        } catch (InterruptedException e) {
            System.out.println("\nTimer interrupted!");
            return;
        }

        System.out.println("\nTime's up! Take a short break or start the next coding session!");
    }
}