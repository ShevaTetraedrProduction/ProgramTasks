package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10 {
    public String start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть 4 значення (a,b,c,d) у кубічне рівнняння a*x^3 + b*x^2 + c*x + d = 0");
        int[] abcd = new int[4];

        for (int i = 0; i < abcd.length; i++)
            abcd[i] = in.nextInt();

        if (abcd[0] == 0) return "0_0";

        System.out.println("Рівняння-->" + abcd[0] + "x^3 + " + abcd[1] + "x^2 + " + abcd[2] + "x + " + abcd[3] + " = 0");
        for (Object i : solving_the_equation(abcd)) {
            System.out.println(i);
        }

        return "))";

    }

    private ArrayList solving_the_equation(int[] array) {
        ArrayList aL = new ArrayList();
        if (array[3] == 0) {
            double d = Math.pow(array[1], 2) - 4 * array[0] * array[2];
            System.out.println("D-->" + d);
            //2 degree
            if (d >= 0) {
                aL.add(0, 0d);
                aL.add(1, (-array[1] + Math.pow(d, 0.5)) / (2 * array[0]));
                aL.add(2, (-array[1] - Math.pow(d, 0.5)) / (2 * array[0]));
                if (aL.get(1) == aL.get(2)) aL.remove(2);
            } else {
                System.out.println("Неможливо дістати корені");
            }
            return aL;
        }

        return aL;
    }
}
