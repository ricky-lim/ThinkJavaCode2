package exercises;

import java.util.Scanner;

public class SecondsConverter {
    public static final int SECOND_PER_HOUR = 3600;
    private static final int SECOND_PER_MINUTE = 60;

    public static void main(String[] args) {
        int totalSeconds;
        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds? ");
        totalSeconds = in.nextInt();
        in.nextLine();

        int hours = totalSeconds / SECOND_PER_HOUR;
        int minutes = (totalSeconds % SECOND_PER_HOUR) / SECOND_PER_MINUTE;
        int seconds = totalSeconds % SECOND_PER_MINUTE;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",
                totalSeconds, hours, minutes, seconds);
    }
}
