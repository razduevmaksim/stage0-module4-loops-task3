package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numString = String.valueOf(Math.abs(t));
        int sum = 0;

        for (int i = 0; i < numString.length(); i++){
            sum += Character.getNumericValue(numString.charAt(i));
        }

        System.out.println(sum);
    }
}
