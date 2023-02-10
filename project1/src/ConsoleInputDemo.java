// Импортируется класс Scanner:
import java.util.Scanner;
// Описание класса:
public class ConsoleInputDemo {
    // Главный метод:
    public static void main(String[] args){
        // Создание объекта input класса Scanner:
        Scanner input = new Scanner(System.in);
        // Переменные для считывания названия
        // дня недели и месяца:
        String day, month;
        // Отображается сообщение:
        System.out.print("Какой сегодня день? ");
        // Считывается текстовая строка:
        day = input.nextLine();
        // Отображается сообщение:
        System.out.print("Какой месяц? ");
        // Считывается текстовая строка:
        month = input.nextLine();
        // Текстовая переменная:
        String text;
        // Текстовое значение для отображения в консоли:
        text = "Сегодня " + day + ", месяц - " + month;
        // Отображается сообщение:
        System.out.println(text);
    }
}
