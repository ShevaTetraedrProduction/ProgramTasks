package Tasks;

import java.util.Scanner;

public class Problem7 {
    public long start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть 3 числа");
        long[] array = new long[3];
        for (int i = 0; i < 3; i++) {
            array[i] = in.nextInt();
        }
        long temp = 0;
        for (int i = 1; i < 3; i++) {
            if (array[0] > array[i]) temp = array[0];
            else if (array[i] > array[0]) temp = array[i];
            else return array[i];
        }

        return temp;
    }
}
