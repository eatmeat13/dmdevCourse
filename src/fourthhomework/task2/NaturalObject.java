package fourthhomework.task2;

public abstract class NaturalObject implements SpaceObject{

    private int mass;
    private int volume;
    private String name;


    public NaturalObject(int mass, int volume, String name) {
        this.mass = mass;
        this.volume = volume;
        this.name = name;
    }

    @Override
    public int calculateDistance(SpaceObject spaceObject) {
        return 10;
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Natural object " + name +
                " mass = " + mass +
                ", volume = " + volume ;
    }


    // метод для расчета диаметра
    public double calculateDiameter() {
        double radius = Math.cbrt(3 * volume / (4 * Math.PI));
        return 2 * radius;
    }

    public int compareMass(NaturalObject other) {
        if (mass < other.mass) {
            return -1;
        } else if (mass > other.mass) {
            return 1;
        } else {
            return 0;
        }
    }
}

