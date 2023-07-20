import java.util.Scanner;

public class AlarmClock {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int mins = input.nextInt();
        int current_hour = 0;
        int current_minutes = 0;

        int false_alarm = 0;
        false_alarm = false_alarm - 1; // Account for starting time

        do {
            false_alarm = false_alarm + 1;
            current_hour = input.nextInt();
            current_minutes = input.nextInt();
        } while (((current_hour * 60) + current_minutes) < ((hour * 60) + mins));

        System.out.println("false alarms: " + false_alarm);
    }
}

