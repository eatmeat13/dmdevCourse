package eighthomework.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Magician {
    private static final int NEEDED_COUNT_OF_CRYSTALS = 500;
    private final Map<Crystal, Integer> crystals = new EnumMap<>(Crystal.class);
    private final String race;

    public Magician(String race) {
        this.race = race;
    }

    public void addCrystals(List<Crystal> list) {
        list.forEach(detail -> crystals.merge(detail, 1, Integer::sum));
    }

    public String getRace() {
        return race;
    }

    public Map<Crystal, Integer> getCrystals() {
        return crystals;
    }

    public boolean isCrystalsEnabled() {
        return crystals.getOrDefault(Crystal.RED, 0) < NEEDED_COUNT_OF_CRYSTALS
                || crystals.getOrDefault(Crystal.WHITE, 0) < NEEDED_COUNT_OF_CRYSTALS;
    }
}
