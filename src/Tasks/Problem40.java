package Tasks;
import java.lang.Math;
import java.util.Scanner;

public class Problem40 {
    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть степінь n \n 2^n");
        double n = in.nextDouble();
        System.out.println(Math.pow(2,n));

    }
}
