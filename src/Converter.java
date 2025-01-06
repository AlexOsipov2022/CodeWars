public class Converter {
    public static float mpgToKPM(final float mpg) {
        float koefKm = 1.609344f; // Коэффициент для километров
        float koefLt = 4.54609188f; // Коэффициент для литров
        float mpgKoff = koefKm / koefLt; // Коэффициент для преобразования
        float mpgToKPM = mpg * mpgKoff; // Преобразование

        // Округление до двух знаков после запятой
        return Math.round(mpgToKPM * 100.0f) / 100.0f;
    }

    public static void main(String[] args) {
        float result = Converter.mpgToKPM(40); // Пример использования
        System.out.println(result); // Ожидаемый вывод: 8.5
    }
}
//1 Imperial Gallon = 4.54609188 litres
//1 Mile = 1.609344 kilometres
//https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java