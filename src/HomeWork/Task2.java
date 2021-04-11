package HomeWork;

import java.util.*;

/*   В массиве целых чисел с количеством элементов N найти наиболее часто встречающееся число.
     Если таких чисел несколько, то определить наименьшее из них. */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пользователь, введите любое целое число.");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Пользователь, введите любое целое число");
        }
        int number = sc.nextInt();

        int[] array = new int[number];
        System.out.println("Пользователь, введите любые целые числа в количестве: " + number);

        for (int i = 0; i < number; i++) {
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Пользователь, требуется вводить целые числа!!! ");
            }
            array[i] = sc.nextInt();
        }

        System.out.print("Ваши введенные числа: ");
        Arrays.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int count = 0;
        int a = 0;
        int result = 0;
        int minNumber = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (minNumber == 0) {
                        minNumber = array[i];
                    }
                } else if (count > a) { // высчитывает какое число больше всего раз повторяется
                    a = count;
                    count = 0;
                    result = array[i];
                }
                if (array[i] == array[j] && count >= 1 && i <= array.length - 2) { //  высчитывает, если повторяющиеся числа являются последними в массиве
                    result = array[i];
                }
            }
        }
        if (result == 0) {
            System.out.println("Одинаковых чисел нет!");
        } else {
            System.out.println("Наиболее часто повторяющееся число: " + result);
            System.out.println("Наименьшее из всех повторяющихся чисел: " + minNumber);
        }
    }
}
