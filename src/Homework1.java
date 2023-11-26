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
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}

        name = name.trim().toUpperCase();
        System.out.println(name);
        }


}
