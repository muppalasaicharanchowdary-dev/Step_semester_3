package assigmentweek1;
public class TrafficSignal {

    static void findLongestStreak(String signalLog) {

        char maxChar = signalLog.charAt(0);
        int maxCount = 1;

        char current = signalLog.charAt(0);
        int count = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == current) {
                count++;
            } else {

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = current;
                }

                current = signalLog.charAt(i);
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxChar = current;
        }

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxCount + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}