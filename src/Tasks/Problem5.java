package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    public String start() {
        Scanner in = new Scanner(System.in);
        ArrayList al = new ArrayList();
        System.out.println("Введіть числа місяця,в які Василь отримував оцінку, якщо захочете завершити вводити числа натисніть\"0\"");
        int x, f = 0, s = 0;
        for (; ; ) {
            x = in.nextInt();
            if (x < 1 || x > 31) break;
            else al.add(x);
        }
        System.out.println("Розмір масиву-->" + al.size());
        System.out.print("Парні числа-->");
        for (int i = 0; i < al.size(); i++) {
            if ((int) al.get(i) % 2 == 0) {
                System.out.print(" " + al.get(i));
                f++;
            }
        }
        System.out.print("\nНе парні числа-->");
        for (int i = 0; i < al.size(); i++) {
            if ((int) al.get(i) % 2 != 0) {
                System.out.print(" " + al.get(i));
                s++;
            }
        }
        System.out.println();
        if (s <= f)return  "YES";
        else return  "NO";

    }
}
