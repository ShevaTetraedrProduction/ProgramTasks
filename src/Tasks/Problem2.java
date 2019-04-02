package Tasks;

import java.util.Scanner;

public class Problem2 {
    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть крайнє число, щоб орахувати суму цілих чисел від 1 до N");
        int N = in.nextInt();
        int total = 0;
        for (int i = N; i > 0; i-- ){
            total+=i;
        }
        System.out.println(total);
    }
}
