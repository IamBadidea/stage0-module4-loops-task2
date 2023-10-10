package school.mjc.stage0.loops.task2;

public class Multiplication {

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(-4);
    }
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive >= 0) {
            fromZero(multiplyByAndToInclusive);
        } else {
            fromNegativeNumber(multiplyByAndToInclusive);
        }
    }

    private void fromZero(int toPositiveNumber) {
        int i = 1;
        System.out.println(0);
        while (i <= toPositiveNumber) {
            int multiply = 1;
            int j = i;
            while (j >= 1) {
                multiply *= j;
                j--;
            }
            System.out.println(multiply);
            i++;
        }
    }
    private void fromNegativeNumber(int toNegativeNumber) {
        int i = -1;
        System.out.println(0);
        while (i >= toNegativeNumber) {
            int multiply = 1;
            int j = i;
            while (j <= -1) {
                multiply *= j;
                j++;
            }
            System.out.println(multiply);
            i--;
        }
    }
}
