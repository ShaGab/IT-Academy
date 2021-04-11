package HomeWork;

import java.util.*;

/*   Программа запрашивает количество чисел, вводит целые числа в соответствии с заявленным количеством ,
     определяет, сколько чисел больше 15 или <2, чему равна сумма чисел, которые делятся на 5 с остатком 4.
     Результат вывести на экран. */

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пользователь, введите желаемое число");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Пользователь, введите желаемое число");
        }

        int number = sc.nextInt();

        System.out.println("Пользователь, введите любые целые числа в количестве: " + number);
        int array[] = new int[number];

        int count = number;
        for (int i = 0; i < number; i++) {
            while (!sc.hasNextInt()) {
                sc.nextLine();
                if (count == 1) {
                    System.out.println("Пользователь, вводите целые числа!");
                    System.out.println("Осталось ввести " + count + " число!");
                } else if (count >= 2 && count <= 4) {
                    System.out.println("Пользователь, вводите целые числа!");
                    System.out.println("Осталось ввести " + count + " числа!");
                } else {
                    System.out.println("Пользователь, вводите целые числа!");
                    System.out.println("Осталось ввести " + count + " чисел!");
                }
            }

            array[i] = sc.nextInt();
            count--;
        }
        int count1 = 0;
        System.out.print("Ваши введенные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 15 || array[i] < 2) {
                count1++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Количество чисел больше 15 и меньше 2 равно: " + count1);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 4) {
                sum += array[i];
            }
        }
        System.out.println("Сумма чисел, которые делятся на 5 с остатком 4, равнa " + sum);
    }
}

