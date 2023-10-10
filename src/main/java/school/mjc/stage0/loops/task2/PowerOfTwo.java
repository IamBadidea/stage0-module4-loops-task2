package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        p.printPower(4);
    }
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int i = 0;

        while (power >= i) {
            System.out.println(getPowerOfTwo(i));
            i++;
        }
    }

    private long getPowerOfTwo(int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return 2;
        }

        long result = 2;

        while (power > 1) {
            result *= 2;
            power--;
        }

        return result;
    }
}
