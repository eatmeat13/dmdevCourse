package homeworks.fifthhomework.second.task;


/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class TaskRunner {
    public static void main(String[] args) {

        Film film = new Film(1, 1900, Month.NOVEMBER, Genre.DRAM, 5.0);
        Film film1 = new Film(2, 1901, Month.MAY, Genre.COMEDY, 4.0);
        Film film2 = new Film(3, 1902, Month.JULY, Genre.DETECTIVE, 3.0);
        Film film3 = new Film(4, 1900, Month.SEPTEMBER, Genre.COMEDY, 1.0);
        Film film4 = new Film(5, 1908, Month.SEPTEMBER, Genre.COMEDY, 10.0);
        Film film5 = new Film(6, 1907, Month.SEPTEMBER, Genre.DRAM, 111.0);

        Cinema cinema = new Cinema();
        cinema.addFilm(film);
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);
        cinema.addFilm(film5);
        System.out.println(cinema);
        System.out.println(cinema.findFilmsByYear(1900));
        System.out.println(cinema.findFilmsByYearAndMonth(1900, Month.NOVEMBER));
        System.out.println(cinema.findFilmsByGenre(1900, Genre.DRAM));
        System.out.println(cinema.getTop10Movies());
    }
}
