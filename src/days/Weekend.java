package days;

import java.util.Scanner;

enum Day {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private final String dayName;

    Day(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}

public class Weekend {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number for the weekend (6 or 7)");
        int dayNumber = in.nextInt();

        if (dayNumber == 6 || dayNumber == 7) {
            Day[] days = Day.values();
            System.out.println("Day: " + days[dayNumber - 1].getDayName());
        } else {
            System.out.println("Invalid day number for the weekend");
        }
    }
}
