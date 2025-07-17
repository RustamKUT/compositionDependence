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

        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель 'Белград'";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм
        String[] expected = {film3, film2, film1}; // фактический результат. Добавить 5 фильмов

        Assertions.assertArrayEquals(expected, actual); // Проверка
    }

    @Test
    public void showMoreLimit() // Тест Покажи больше лимита
    {
        FilmsManager manager = new FilmsManager(5); // Создаем менеджер. Который тестируем

        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель 'Белград'";
        String film4 = "Джентельмены";
        String film5 = "Человек-невидимка";
        String film6 = "Номер один";


        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] actual = manager.findLast(); // ожидаемый результат. Добавить 1 фильм
        String[] expected = {film6, film5, film4, film3, film2}; // фактический результат. Добавить 5 фильмов


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