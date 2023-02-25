package fourthhomework.task2;

public class Planet extends NaturalObject {

    boolean hasRing;
    boolean hasLife;

    public Planet(int mass, int volume, String name, boolean hasRing, boolean hasLife) {
        super(mass, volume, name);
        this.hasRing = hasRing;
        this.hasLife = hasLife;
    }

    public boolean isHasRing() {
        return hasRing;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", It's Planet! { hasRing = " + hasRing +
                ", hasLife = " + hasLife + " }";
    }
}
