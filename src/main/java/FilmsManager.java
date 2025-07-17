public class FilmsManager {

    private  String[] films = new String[0]; // Заводим пустой массив
    private int limit; // Заводим переменную лимит

    public FilmsManager() // Конструктор по умолчанию. Без параметров
    {
        this.limit = 5;
    }

    public FilmsManager(int limit) // Конструктор с параметром.
    {
        this.limit = limit;
    }

    public void  addFilm(String film) // Добавление фильма. Принимаем Строку
    {
        String[] tmp = new String[films.length + 1]; // Создаем новый массив. Длинной +1
        for (int i = 0; i <films.length; i++)
        {
            tmp[i] = films[i]; // Из старого копируем в новый
        }
        tmp[tmp.length - 1] = film; // последняя ячейка это определенный фильм
        films = tmp; // Запоминаем. Обновленный массив
    }

    public String[] findAll() // Показать все фильмы
    {
        return films; // Возврат фильмов
    }

//    public String[] findLast() // Показать последние фильмы с определенным лимитом
//    {
//        int resultLength; // Создаем переменную для расчета размера ответа
//        if (films.length < limit) // Проверка Если фильмов меньше чем лимит
//        {
//            resultLength = films.length; // То возьмем сколько есть
//        } else {
//            resultLength = limit; // Иначе мы возьмем лимит
//        }
//        String[] tmp = new String[resultLength]; // Создаем массив ответа
//        for (int i = 0; i < tmp.length; i++)
//        {
//            tmp[i] = films[films.length - 1 - i]; // Заполняем его. С конца нашего поля. Размер массива - 1 - номер с конца
//        }
//        return tmp; // Возврат массива
//    }

    public String[] findLast() {
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }

}
