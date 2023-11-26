// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework1 {
    public static void main(String[] args) {
        //+++Задание №1+++
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
        //+++Задание №2+++
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel < 10
                        ||  (!isWheelWork1 || isWheelWork2 || isWheelWork3 || isWheelWork4)
                        && hasErrors
                        || isEngineWork
        ) {
            System.out.println("Машина работает");
        } else System.out.println("Машина не работает");
    }
}
