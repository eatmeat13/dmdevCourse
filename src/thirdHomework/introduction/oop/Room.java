package thirdHomework.introduction.oop;

public class Room {
    private final int number;
    private final boolean isThrough;

    public Room(int number,boolean isThrough) {
        this.isThrough = isThrough;
        this.number = number;
    }

    public void print() {
        if (isThrough){
            System.out.println("Room is through");
        } else System.out.println("Room is not through");
    }
}
