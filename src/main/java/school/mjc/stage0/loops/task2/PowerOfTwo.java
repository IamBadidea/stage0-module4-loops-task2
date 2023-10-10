package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int i = 0;

        while (i <= power) {
            int j = 1;
            while (i >= 1) {
                j *= 2;
            }
            System.out.println(j);
        }

    }
}
