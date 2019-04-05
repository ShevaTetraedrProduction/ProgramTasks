package Tasks;

import java.util.Scanner;

public class Problem8 {
    public String start() {
        Scanner in = new Scanner(System.in);
        long[] array = new long[3];
        System.out.println("Введіть перший множник другий множник та добуток");
        long temp = 0;
        for (int i = 0; i < 3; i++) {
            temp = in.nextInt();
            if (i == 2 && temp <= 1000000 && temp >= 0) {
                array[i] = temp;
            } else if (i <= 1 && temp <= 100 && temp >= 0) {
                array[i] = temp;
            } else return "0_0";
        }

        if (array[0] * array[1] == array[2])return "YES";
        else return "NO";


    }
}
