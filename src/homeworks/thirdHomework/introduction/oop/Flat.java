package homeworks.thirdHomework.introduction.oop;

public class Flat {

    private final int flatNumber;
    private final Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Flat number: " + flatNumber);
        for (Room room: rooms) {
            room.print();
        }
    }
}
