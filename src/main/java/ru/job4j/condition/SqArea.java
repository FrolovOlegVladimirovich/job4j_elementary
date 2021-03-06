package ru.job4j.condition;

/**
 * Вычисление площади прямоугольника при известных значениях периметра и значения разницы между шириной и высотой.
 * @author Oleg Frolov (frolovolegvladimirovich@gmail.com)
 * @since 09.05.2019
 * @version 1.0
 */

public class SqArea {

    /**
     * Метод для вычисления площади прямоугольника при известных значениях периметра и значения разницы между шириной и высотой.
     * @param perimeter значение периметра прямоугольника.
     * @param ratio - соотношение: ширина больше высоты в ratio раз.
     * @return Площадь прямоугольника.
     */
    public static int square(int perimeter, int ratio) {
        int height = (perimeter / 2) / (ratio + 1);
        int length = height * ratio;
        return height * length;
    }
}