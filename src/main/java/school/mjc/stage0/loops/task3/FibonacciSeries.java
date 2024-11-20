package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int numForDelete;
        int lastFibonacciNumber = 0;
        int currentFibonacciNumber = 1;

        for (int i = 1; i <= lastFibonacci; i++){
            System.out.println(lastFibonacciNumber);
            numForDelete = currentFibonacciNumber;
            currentFibonacciNumber += lastFibonacciNumber;
            lastFibonacciNumber = numForDelete;
        }
    }
}
