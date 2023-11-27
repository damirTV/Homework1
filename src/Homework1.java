// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework1 {
    public static void main(String[] args) {
        // +++ Задание №1 +++
        System.out.println("\nЗадание №1");
        ///Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ОВА " то печатаем на экран: Уважаемая {name}
        // Если содержит "ОВ " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        name = name.trim().toUpperCase();
        if (name.contains("ОВА ")) {
            System.out.println("Уважаемая " + name);
        } else if (name.contains(("ОВ "))) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }

        // +++ Задание №2 +++
        System.out.println("\nЗадание №2");
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = false;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = false;
        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10 && isEngineWork && isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4 && !hasErrors) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает:");
            if (fuel < 10) {
                System.out.println("Топлива меньше 10 литров");
            }
            if (!isEngineWork) {
                System.out.println("Неисправность в двигателе");
            }
            if (!hasErrors) {
                System.out.println("Обнаружены ошибки");
            }
            if (!isWheelWork1 || !isWheelWork2 || !isWheelWork3 || !isWheelWork4) {
                System.out.println("Проверьте давление в шинах");
            }
        }

        // +++ Задание №3 +++
        System.out.println("\nЗадание №3");
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are").toLowerCase();
        int index;
        index = simply.indexOf("o", simply.indexOf("o") + 1);
        System.out.println("Индекс второй буквы 'o': " + index);

        // +++ Задание №4 +++
        System.out.println("\nЗадание №4");
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000 (не включительно), облагается ставкой 13%
        // прибыль до налогов от 1_000_001 (включительно) до 2_000_000 (включительно), облагается ставкой 10%
        // прибыль до налогов меньше или равно 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //999_999 - налог 99_999.9 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 99_999.9 + 65_000 = 249_999.9
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг
        String typeProduct1 = "Колбаса";
        int weightProduct1 = 2000;
        String typeProduct2 = "Ветчина";
        int weightProduct2 = 8511;
        String typeProduct3 = "Шейка";
        int weightProduct3 = 6988;

        System.out.println("Продаем товары:");
        System.out.println(typeProduct1 + ": " + weightProduct1 + " кг.");
        System.out.println(typeProduct2 + ": " + weightProduct2 + " кг.");
        System.out.println(typeProduct3 + ": " + weightProduct3 + " кг.");
        System.out.println("Прибыль после налогов: " + FinanceCalc(weightProduct1, typeProduct1, weightProduct2, typeProduct2, weightProduct3, typeProduct3));
    }
    private static float FinanceCalc (int weightProduct1, String typeProduct1, int weightProduct2, String typeProduct2, int weightProduct3, String typeProduct3) {
        int priceProduct1 = PriceProduct(typeProduct1); // Получаем цену первого типа продукта
        int priceProduct2 = PriceProduct(typeProduct2); // Получаем цену второго типа продукта
        int priceProduct3 = PriceProduct(typeProduct3); // Получаем цену третьего типа продукта
        // Расчет суммарного дохода по всем продуктам
        int revenueProducts = RevenueProduct(priceProduct1, weightProduct1) + RevenueProduct(priceProduct2, weightProduct2) + RevenueProduct(priceProduct3, weightProduct3);
        // Расчет суммарного расхода по всем продуктам
        int fixCost = 1_000_000; // Фиксированная стоимость прочих расходов
        int expensesProducts = ExpensesProduct(typeProduct1, weightProduct1) + ExpensesProduct(typeProduct2, weightProduct2) + ExpensesProduct(typeProduct3, weightProduct3) + fixCost;
        // Расчет прибыли до налогов
        int profitBeforeTax = ProfitBeforeTax(revenueProducts, expensesProducts);
        // Расчет прибыли после налогов
        float profitAfterTaxTax = ProfitAfterTax(profitBeforeTax);
        return profitAfterTaxTax;
    }
    private static int PriceProduct (String typeProduct) { // Подсчет цены продукта
        int cost1 = 800; // Цена для колбасы
        int cost2 = 350; // Цена для ветчины
        int cost3 = 500; // Цена для шейки
        if (typeProduct.equals("Колбаса")) {
            return cost1;
        } else if (typeProduct.equals("Ветчина")) {
            return cost2;
        } else if (typeProduct.equals("Шейка")) {
            return cost3;
        } else return -1;
    }
    private static int RevenueProduct ( int priceProduct, int weightProduct) { // Подсчет дохода
        return priceProduct * weightProduct;
    }
    private static int ExpensesProduct ( String typeProduct, int weightProduct) { // Подсчет расхода
        int costSausage1 = 412; // Себестоимость колбасы в диапазоне 1-999 кг.
        int costSausage2 = 408; // Себестоимость колбасы в диапазоне 1000-1999 кг.
        int costSausage3 = 404; // Себестоимость колбасы от 2000 кг.
        int costHam1 = 275; // Себестоимость ветчины
        int costNeck1 = 311; // Себестоимость шейки в диапазоне 1-499 кг.
        int costNeck2 = 299; // Себестоимость шейки от 500 кг.
        if (!typeProduct.equals("Колбаса") && !typeProduct.equals("Ветчина") && !typeProduct.equals("Шейка")) {
            return -1; // Ошибка при неизвестном типе продуктов
        }
        if (weightProduct <=0) {
            return -2; // Ошибка при весе продукта меньше или равным 0
        }
        if (typeProduct.equals("Колбаса")) { // Подсчет расхода Колбасы
            if (weightProduct >0 && weightProduct < 1000) {
                return costSausage1 * weightProduct;
            } else if (weightProduct >= 1000 && weightProduct < 2000) {
                return costSausage2 * weightProduct;
            } else {
                return costSausage3 * weightProduct;
                }
            } else if (typeProduct.equals("Ветчина")) { // Подсчет расхода Ветчины
            return costHam1 * weightProduct;
        } else { // Подсчет расхода Шейки
            if (weightProduct < 500) {
                return costNeck1 * weightProduct;
            } else {
                return costNeck2 * weightProduct;
            }
        }
    }
    private static int ProfitBeforeTax (int revenueProduct, int expensesProduct) { // Подсчет прибыли до налогов
        return revenueProduct - expensesProduct;
    }
    private static float ProfitAfterTax (int profitBeforeTax) { // Подсчет прибыли после налогов
        float tax1 = 0.08F; // прибыль до налогов меньше или равно 1_000_000, облагается ставкой 8%
        float tax2 = 0.10F; // прибыль до налогов больше 1_000_000 до 2_000_000 (включительно), облагается ставкой 10%
        float tax3 = 0.13F; // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        if (profitBeforeTax <= 1_000_000) {
            return profitBeforeTax - (profitBeforeTax * tax1);
        } else if (profitBeforeTax > 1_000_000 && profitBeforeTax < 2_000_000) {
            return profitBeforeTax - ((1_000_000 * tax1) + (profitBeforeTax - 1_000_000)*tax2);
        } else {
            return profitBeforeTax - ((1_000_000 * tax1) + (999_999 * tax2) + ((profitBeforeTax - 2_000_000)*tax3));
        }
    }
}
