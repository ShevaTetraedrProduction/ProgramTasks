package Tasks;
import java.lang.Math;
import java.util.Scanner;

public class Problem40 {
    public double start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть степінь n (2^n)");
        double n = in.nextDouble();
        return Math.pow(2,n);

    }
}
