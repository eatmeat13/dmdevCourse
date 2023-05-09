package homeworks.fourthhomework.task2;

public abstract class ArtificialObject implements SpaceObject {

    private String creator;
    private int yearOfCreate;

    private int mass;
    private int volume;
    private String name;

    public ArtificialObject(int mass, int volume, String name, String creator, int yearOfCreate) {
        this.mass = mass;
        this.volume = volume;
        this.name = name;
        this.creator = creator;
        this.yearOfCreate = yearOfCreate;

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
        return "Artificial object " + name +
                " mass = " + mass +
                ", volume = " + volume +
                " created in " + yearOfCreate +
                " by " + creator;
    }

    @Override
    public int calculateDistance(SpaceObject spaceObject) {
        return 2;
    }
}
