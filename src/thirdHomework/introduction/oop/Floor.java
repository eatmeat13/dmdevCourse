package thirdHomework.introduction.oop;

public class Floor {

    private final int floorNumber;
    private final Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Floor number: " + floorNumber);
        for (Flat flat : flats) {
            flat.print();
        }
    }
}

