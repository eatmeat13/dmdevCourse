package eighthomework.thread;


import eighthomework.model.Magician;
import eighthomework.util.DayConst;

public class Day extends Thread {

    private final Object lock = new Object();
    private final Magician firstMagician;
    private final Magician secondMagician;

    public Day(Magician magician1, Magician magician2) {
        this.firstMagician = magician1;
        this.secondMagician = magician2;
    }

    @Override
    public void run() {
        int count = 0;
        while (firstMagician.isCrystalsEnabled() && secondMagician.isCrystalsEnabled()
        ) {
            synchronized (lock) {
                try {
                    System.out.printf("----------------\nДень %s начался\n", (count + 1));
                    lock.notifyAll();
                    lock.wait(DayConst.DAY_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Object getLock() {
        return lock;
    }

    public Magician getFirstMagician() {
        return firstMagician;
    }

    public Magician getSecondMagician() {
        return secondMagician;
    }
}
