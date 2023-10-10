package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        System.out.println(2);
        System.out.println(3);
        int i = 4;
        boolean flag = false;
        while (i < printToInclusive) {
            int j = i - 1;
            while (j >= 1) {
                if (i % j == 0) {
                    flag = true;
                }
                j--;
            }

            if (flag == false) {
                System.out.println(i);
            }

            i++;
        }
    }
}
