import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    @Test
    public void addFilmZero() // Тест на добавление фильма/ 0 шт.
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        String[] expected = {}; // фактический результат. Пустой массив
        String[] actual = manager.findAll(); // ожидаемый результат. Добавить 0 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void addFilmOne() // Тест на добавление фильма. 1 шт.
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"}; // фактический результат. Добавить 1 фильм
        String[] actual = manager.findAll(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void addFilmsFive() // Тест на добавление фильма. 5 шт.
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек-невидимка"}; // фактический результат. Добавить 5 фильмов
        String[] actual = manager.findAll(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void showLessLimit() // Тест Покажи меньше лимита
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"}; // фактический результат. Добавить 5 фильмов
        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void showMoreLimit() // Тест Покажи больше лимита
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"}; // фактический результат. Добавить 5 фильмов
        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void showEqualLimit() // Тест Покажи равен лимиту
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"}; // фактический результат. Добавить 5 фильмов
        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void boundaryValues() // Тест Граничные значения
    {
        FilmsManager manager = new FilmsManager(); // Создаем менеджер. Который тестируем

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель 'Белград'");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"}; // фактический результат. Добавить 5 фильмов
        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }





}