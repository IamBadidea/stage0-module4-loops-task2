package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            System.out.println(getFactorial(i));
        }
    }

    private int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;

        while (number >= 1) {
            result *= number;
            number--;
        }

        return result;
    }
}
