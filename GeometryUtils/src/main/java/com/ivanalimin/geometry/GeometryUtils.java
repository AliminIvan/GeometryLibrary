package com.ivanalimin.geometry;

/*
Создайте модуль "GeometryUtils" в проекте "GeometryLibrary", в котором определите дополнительные функции для манипуляций
с геометрическими данными (например, преобразование единиц измерения, сравнение фигур и т.д.).

Установите версию "GeometryUtils" в "1.0.0-SNAPSHOT".

В проекте "GeometryApp" добавьте зависимость от "GeometryUtils" и используйте его функциональность.

В модуле "GeometryUtils" внесите изменения и увеличьте версию до "1.1.0-SNAPSHOT".

В проекте "GeometryApp" попробуйте обновить зависимость "GeometryUtils" до новой версии и решите конфликты зависимостей.
 */
public class GeometryUtils {

    private GeometryUtils() {
    }

    public static double convertToSquareMeters(double areaInSquareFeet) {
        return areaInSquareFeet * 0.092903;
    }

    public static boolean areAreasEqual(double area1, double area2) {
        return Double.compare(area1, area2) == 0;
    }

    public static double convertCentimetersToMeters(double centimeters) {
        return centimeters / 100;
    }
}

