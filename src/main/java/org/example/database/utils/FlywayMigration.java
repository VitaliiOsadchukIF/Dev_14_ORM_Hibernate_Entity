package org.example.database.utils;


//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.flywaydb.core.Flyway;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Цей клас відповідає за управління міграцією схеми бази даних за допомогою Flyway.
 */
public class FlywayMigration {

    private static final Logger LOG = LogManager.getLogger(FlywayMigration.class);

    /**
     * Приватний конструктор для запобігання створенню екземпляру класу FlywayMigration.
     */
    private FlywayMigration() {
    }

    /**
     * Виконує міграцію бази даних за допомогою Flyway для підтримки послідовності схеми бази даних.
     */
    public static void migrateDatabase() {
        LOG.info("Виконання міграції за допомогою Flyway");

        Flyway.configure()
                .dataSource(Config.JDBC_URL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();

        LOG.info("Міграція за допомогою Flyway завершена");
    }
}
