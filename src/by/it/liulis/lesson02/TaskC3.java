package by.it.liulis.lesson02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод:");
        int x = scanner.nextInt();
        System.out.println("");
        System.out.println("Вывод:");
        System.out.println(getWeight(x));
    }

    public static double getWeight(int weight) {
        double gEarth = 9.81;
        double gMars = 3.86;
        double k = gMars / gEarth;
        double weightOnTheMars = weight * k;
        weightOnTheMars = round(weightOnTheMars);

        return weightOnTheMars;
    }

    public static double round(double x) {
        x *= 100;
        int i = (int) Math.round(x);

        return x = (double) i / 100;
    }


}
