package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предыдущее значение счетчика: ");
        double prevValue = sc.nextDouble();
        System.out.print("Введите текущее значение счетчика: ");
        double currentValue = sc.nextDouble();
        System.out.print("Количество проживающих человек: ");
        int people = sc.nextInt();
        sc.close();

        double consumed = Math.abs(prevValue - currentValue);
        double consumedPerPeople = consumed / people;
        double rate1 = 16.24;
        double rate2 = 21.8;
        double rate3 = 25.6;

        double usedVal3 = Math.max(0, consumedPerPeople - 190);
        double usedVal2 = Math.max(0, consumedPerPeople - 115 - usedVal3);
        double usedVal1 = Math.max(0, consumedPerPeople - usedVal3 - usedVal2);

        double sumVal1 = usedVal1 * people;
        double sumVal2 = usedVal2 * people;
        double sumVal3 = usedVal3 * people;

        System.out.println();
        System.out.printf("Вы потребили:\n" +
                        "Первый уровень: %.2f kWt\n" +
                        "Второй уровень: %.2f kWt\n" +
                        "Третий уровень: %.2f kWt\n",
                sumVal1,
                sumVal2,
                sumVal3);

        System.out.printf("\nТариф: %s тг, %s тг, %s тг\n", rate1, rate2, rate3);

        System.out.printf("\nК оплате:\n" +
                        "Первый уровень: %.2f kWt\n" +
                        "Второй уровень: %.2f kWt\n" +
                        "Третий уровень: %.2f kWt\n",
                sumVal1 * rate1,
                sumVal2 * rate2,
                sumVal3 * rate3);

        System.out.println("Итого: " + (sumVal1 * rate1 + sumVal2 * rate2 + sumVal3 * rate3));
    }
}
