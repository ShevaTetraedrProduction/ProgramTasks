package Tasks;

import java.util.Scanner;

public class Problem1 {
    public double start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть два доданка");
        double A = in.nextDouble();
        double B = in.nextDouble();
        return A + B;
    }
}
