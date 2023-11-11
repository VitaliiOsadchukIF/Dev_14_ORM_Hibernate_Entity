package org.example.database.utils;

// Цей клас містить налаштування для з'єднання з базою даних MySQL.

public class Config {

//     JDBC URL для підключення до бази даних.

    public static final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";

//    Ім'я користувача для підключення до бази даних.

    public static final String USERNAME = "postgres";

    // Пароль для підключення до бази даних.

    public static final String PASSWORD = "Radistj21+";

    // Приватний конструктор. Використовується для запобігання створенню екземплярів цього утилітного класу.

    private Config() {
    }
}
