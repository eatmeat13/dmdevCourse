package eighthomework;


import eighthomework.model.Crystal;
import eighthomework.model.Magician;
import eighthomework.thread.Day;
import eighthomework.thread.GrowCrystals;
import eighthomework.thread.Rocket;
import eighthomework.util.RandomUtil;
import eighthomework.util.ThreadUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompetitionRunner {

    public static void main(String[] args) throws InterruptedException {

        Magician airMagician = new Magician("Маги воздуха");
        Magician fireMagician = new Magician("Маги огня");

        Day day = new Day(airMagician, fireMagician);
        GrowCrystals growCrystals = new GrowCrystals(day, getInitialCrystals());
        Rocket airRocket = new Rocket(airMagician, fireMagician, growCrystals.getDump(), day);
        Rocket fireRocket = new Rocket(fireMagician, airMagician, growCrystals.getDump(), day);

        ThreadUtil.startThreads(day, growCrystals, airRocket, fireRocket);
        ThreadUtil.joinThreads(day, growCrystals, airRocket, fireRocket);

        viewStatistic(airRocket.getMagician(), fireRocket.getMagician());
        determinateWinner(airMagician, fireMagician);
    }

    private static List<Crystal> getInitialCrystals() {
        return IntStream.range(0, 20)
                .map(value -> RandomUtil.getNext(Crystal.CASHED_VALUES.size()))
                .mapToObj(Crystal.CASHED_VALUES::get)
                .collect(Collectors.toList());
    }

    private static void viewStatistic(Magician firstMagician, Magician secondMagician) {
        System.out.println("----------------");
        System.out.println(firstMagician.getRace() + " собрали " + firstMagician.getCrystals().get(Crystal.RED) +
                " красных кристалов  и " + firstMagician.getCrystals().get(Crystal.WHITE) + " белых кристалов");
        System.out.println(secondMagician.getRace() + " собрали " + secondMagician.getCrystals().get(Crystal.RED) +
                " красных кристалов и " + secondMagician.getCrystals().get(Crystal.WHITE) + " белых кристалов");
    }

    private static void determinateWinner(Magician firstMagician, Magician secondMagician) {
        if (!firstMagician.isCrystalsEnabled()) {
            System.out.println("Победили " + firstMagician.getRace());
        } else {
            System.out.println("Победили " + secondMagician.getRace());
        }
    }
}
