package eighthomework.thread;

import eighthomework.model.Crystal;
import eighthomework.model.Planet;
import eighthomework.util.RandomUtil;

import java.util.Collections;
import java.util.List;

public class GrowCrystals extends Thread {

    private static final int MAX_DETAILS_COUNT = 3;
    private final Day day;
    private final Planet planet;

    public GrowCrystals(Day day) {
        this(day, Collections.emptyList());
    }

    public GrowCrystals(Day day, List<Crystal> initialCrystals) {
        this.planet = new Planet(initialCrystals);
        this.day = day;
    }


    @Override
    public void run() {
        try {
            while (day.getFirstMagician().isCrystalsEnabled() && day.getSecondMagician().isCrystalsEnabled()
            ) {

                growthNewCrystals();
                waitNextDay();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void growthNewCrystals() {
        int countDetailsForThrowingToDump = RandomUtil.getNextStartWithTwo(MAX_DETAILS_COUNT);
        synchronized (planet.getLock()) {
            for (int j = 0; j < countDetailsForThrowingToDump; j++) {
                Crystal crystal = Crystal.CASHED_VALUES.get(RandomUtil.getNext(Crystal.CASHED_VALUES.size()));
                planet.add(crystal);
            }
            System.out.println("На планете выросли новые кристаллы. Количество: " + countDetailsForThrowingToDump);
        }
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }

    public Planet getPlanet() {
        return planet;
    }
}
