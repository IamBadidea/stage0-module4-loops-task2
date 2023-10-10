package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1;
        System.out.println(0);
        while (i <= multiplyByAndToInclusive) {
            int multiply = 1;
            while (i <= multiplyByAndToInclusive) {
                multiply *= i;
            }
            System.out.println(multiply);
        }
    }
}
