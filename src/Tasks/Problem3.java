package Tasks;

import java.util.Scanner;

public class Problem3 {
    public int start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число яке буде перемножене само на себе");
        int n = in.nextInt();
        return n * n;
    }
}
