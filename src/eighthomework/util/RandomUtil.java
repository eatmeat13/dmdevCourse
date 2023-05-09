package eighthomework.util;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getNextStartWithTwo(int bound) {
        return RANDOM.nextInt(bound) + 2;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }
}
