package thirdHomework.introduction.oop;

public class House {
    private final int houseNumber;
    private final Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.println("House " + houseNumber);
        for (Floor floor : floors) {
            floor.print();

        }
    }
}