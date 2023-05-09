package eighthomework.thread;


import eighthomework.model.Crystal;
import eighthomework.model.Magician;
import eighthomework.model.Planet;
import eighthomework.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Rocket extends Thread {

    private static final int MAX_CRYSTALS_COUNT = 4;
    private final Day day;
    private final Magician magician;
    private final Magician anotherMagician;
    private final Planet planet;

    public Rocket(Magician magician, Magician anotherMagician, Planet planet, Day day) {
        this.magician = magician;
        this.anotherMagician = anotherMagician;
        this.planet = planet;
        this.day = day;
    }

    @Override
    public void run() {
        try {
            while (magician.isCrystalsEnabled() && anotherMagician.isCrystalsEnabled()) {
                List<Crystal> crystals = gatherGrowthCrystals();
                magician.addCrystals(crystals);
                if (magician.isCrystalsEnabled()) {
                    waitNextDay();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<Crystal> gatherGrowthCrystals() {
        int crystalsCount = RandomUtil.getNext(MAX_CRYSTALS_COUNT);
        List<Crystal> growthCrystals = new ArrayList<>(MAX_CRYSTALS_COUNT);
        synchronized (planet.getLock()) {
            if (planet.size() <= crystalsCount) {
                growthCrystals.addAll(planet.removeAll());
            } else if (planet.isNotEmpty()) {
                for (int j = 0; j < crystalsCount; j++) {
                    Crystal removedDetail = planet.remove(RandomUtil.getNext(planet.size()));
                    growthCrystals.add(removedDetail);
                }
            }
            System.out.printf("%s собрали сегодня такие кристаллы: %s\n", magician.getRace(), growthCrystals);
        }

        return growthCrystals;
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }

    public Magician getMagician() {
        return magician;
    }
}
