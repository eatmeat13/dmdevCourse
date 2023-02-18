package thirdHomework.introduction.oop;

public class Floor {

    private final int floorNumber;
    private final int[] flats;

    public Floor(int floorNumber, int[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public void ptint() {
        System.out.println("Floor number: " + floorNumber + " number of flats: " + flats.length);
    }

}

