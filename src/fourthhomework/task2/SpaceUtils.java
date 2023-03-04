package fourthhomework.task2;

public final class SpaceUtils {
    public static final int G = 10;
    public static final int MASS_OF_SUN = 10000;

    private SpaceUtils() {
    }

    public static double calculateGravityForce(SpaceObject object1, SpaceObject object2) {
        double distance = object1.calculateDistance(object2);
        return G * object1.getMass() * object2.getMass() / Math.pow(distance, 2);
    }

    public static boolean isStar(SpaceObject object) {
        return object.getMass() >= MASS_OF_SUN;
    }

    public static void main(String[] args) {
        Planet earth = new Planet(1, 2, "Earth", false, true);
        Moon moon = new Moon(1, 2, "Moon");
        System.out.println(calculateGravityForce(earth, moon));
    }
}
