package Tasks;

import java.util.Scanner;

public class Problem9 {
    public String start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину масива");
        int length = in.nextInt();
        int[] array = new int[length];
        int[] a = new int[2];
        int temp = 0;
        System.out.println("Запишіть " + length + " значень");
        for (int i = 0; i < length; i++) {
            temp = in.nextInt();
            if (temp <= 100)
                array[i] = temp;
        }

        a[0] = addAllPositive(array);
        a[1] = milti(array);

    return   "Сума усіх додатніх чисел масиву становить-->" + a[0] + "\n" +
            "Множення усіх чисел від позиції мінімальної до максимальної становить-->" + a[1];

    }

    private int posminValue(int[] array) {
        int temp = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                temp = array[i];
            else if (temp > array[i]) {
                temp = array[i];
                result = i;
            }
        }
        return result;
    }

    private int posmaxValue(int[] array) {
        int temp = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                temp = array[i];
            else if (temp < array[i]) {
                temp = array[i];
                result = i;
            }
        }
        return result;
    }

    private int addAllPositive(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] >= 0) suma += array[i];

        return suma;
    }

    private int milti(int[] array) {
        int result = 1;
        int min, max;
        if (posminValue(array) < posmaxValue(array)) {
            min = posminValue(array);
            max = posmaxValue(array);
        }
        else if (posmaxValue(array) < posminValue(array)) {
            min = posmaxValue(array);
            max = posminValue(array);
        }
        else min = max = posminValue(array);


        for (int i = min + 1; i < max; i++)
            result *= array[i];


        return result;
    }
}
