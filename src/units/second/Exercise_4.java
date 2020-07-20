package units.second;

import java.time.LocalDateTime;

public class Exercise_4
{
    public static void main(String[] args)
    {
        //Get Different Time values
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute();
        int seconds = LocalDateTime.now().getSecond();

        //Output Time
        int secSinceMidnight = hours * 3600 + minutes * 60 + seconds;
        int secTillMidnight = 24 * 3600 - secSinceMidnight;
        float percentOfTheDay = (float) (secSinceMidnight / (24f * 3600) * 100);

        System.out.printf("%d%n%d%n%.2f%s", secSinceMidnight, secTillMidnight, percentOfTheDay, " %");
    }
}
