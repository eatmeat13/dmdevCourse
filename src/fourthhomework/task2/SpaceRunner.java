package fourthhomework.task2;

public class SpaceRunner {

    public static void main(String[] args) {
        Planet earth = new Planet(1,2, "Earth", false, true);
        Moon moon = new Moon(1,2,"Moon");
        Rocket vostok = new Rocket(1,5,"Vostok - 1", "USSR",1958);
        System.out.println(earth);
        System.out.println(vostok);
        System.out.println(earth.calculateDiameter());
        System.out.println(earth.compareMass(moon));
        System.out.println();
    }
}
