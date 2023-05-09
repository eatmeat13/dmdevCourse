package homeworks.fourthhomework.task2;

public class Asteroid extends NaturalObject {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Asteroid(int mass, int volume, String name, int speed) {
        super(mass, volume, name);
        this.speed = speed;
    }
}
