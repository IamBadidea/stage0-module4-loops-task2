package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.printPrimeNumbers(100);
    }
    public void printPrimeNumbers(int printToInclusive) {

        int i = 2;
        while (printToInclusive >= i) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    private boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        int i = number - 1;

        while (i > 1) {
            if (number % i == 0) {
                return false;
            }
            i--;
        }

        return true;
    }
}
