package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int minValue = Math.min(first, second);
        int gcdValue = 0;

        if (first == 0) {
            gcdValue = second;
            System.out.println(gcdValue);
            return;
        }
        if (second == 0) {
            gcdValue = first;
            System.out.println(gcdValue);
            return;
        }

        for (int i = 1; i <= minValue; i++) {
            if (first % i == 0 && second % i == 0) {
                gcdValue = i;
            }
        }

        System.out.println(gcdValue);
    }
}
