package kz.kaznu.nurali.HW4;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Abduraimov", "Nurali", "Alisherovich", 2006, "yandex.ru"),
                new User("Канатов", "Эрик", "Рауанович", 2005, "mail.ru"),
                new User("Стопычева", "Анна", "Михайловна", 1978, "mail.ru"),
                new User("Архипов", "Юрий", "Вячеславович", 1950, "gmail.com"),
                new User("Кашкаров", "Владимир", "Васильевич", 1947, "mail.ru"),
                new User("Гафаров", "Дамир", "Талгатович", 2005, "mail.ru"),
                new User("Курбатов", "Антон", "Александрович", 2005, "gmail.com"),
                new User("Рябцева", "Софья", "Сергеевна", 2006, "mail.ru"),
                new User("Абдураимов", "Нурали", "Алишерович", 1979, "yandex.ru"),
                new User("Маршанцева", "Алина", "Максимовна", 2006, "mail.ru"),
        };
        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].getBirthYear() > 40) {
                System.out.println("Пользователь №" + (i + 1));
                users[i].info();
            }

        }
    }
}
