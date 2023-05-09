package homeworks.fifthhomework.second.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Cinema {
    private HashMap<Integer, List<Film>> filmsByYear;


    public Cinema() {
        this.filmsByYear = new LinkedHashMap<>();
    }

    public HashMap<Integer, List<Film>> getListOfFilms() {
        return filmsByYear;
    }

    public void addFilm(Film film) {
        int filmYear = film.getYear();
        if (!filmsByYear.containsKey(filmYear)) {
            filmsByYear.put(filmYear, new ArrayList<>());
        }
        List<Film> films = filmsByYear.get(filmYear);
        if (!films.contains(film)) {
            films.add(film);
        }
    }

    public List<Film> findFilmsByYear(int year) {
        return filmsByYear.get(year);
    }

    public List<Film> findFilmsByYearAndMonth(int year, Month month) {
        List<Film> result = new ArrayList<>();
        List<Film> filmList = filmsByYear.get(year);
        for (Film film : filmList) {
            if (film.getMonth().equals(month)) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> findFilmsByGenre(int year, Genre genre) {
        List<Film> result = new ArrayList<>();
        List<Film> filmList = filmsByYear.get(year);
        for (Film film : filmList) {
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> getTop10Movies() {
        Comparator<Film> filmComparator = (o1, o2) -> Double.compare(o2.getRating(), o1.getRating());
        List<Film> allFilms = new ArrayList<>();
        for (List<Film> filmsByYear : filmsByYear.values()) {
            allFilms.addAll(filmsByYear);
        }
        allFilms.sort(new Comparator<Film>() {
            public int compare(Film m1, Film m2) {
                return Double.compare(m2.getRating(), m1.getRating());
            }
        });
        return allFilms.subList(0, Math.min(allFilms.size(), 10));
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "filmsByYear=" + filmsByYear +
                '}';
    }
}
