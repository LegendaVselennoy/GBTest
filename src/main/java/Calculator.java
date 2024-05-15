public class Calculator {

    // Реализовано в папке test
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0 || (discountAmount <= 0 || discountAmount>=100)) {
            throw new ArithmeticException("Невалидные данные");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100; // Метод должен возвращать сумму покупки со скидкой
    }

}
