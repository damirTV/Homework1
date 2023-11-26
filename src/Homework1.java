// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework1 {
    public static void main(String[] args) {
        System.out.println("+++Задание №1+++");
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

        System.out.println("\n+++Задание №2+++");
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
            if (fuel < 10 ) {
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
        System.out.println("\n+++Задание №3+++");

    }
}
