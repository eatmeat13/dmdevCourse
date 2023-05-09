package homeworks.thirdHomework.introduction.oop;

public class HomeRunner {
    public static void main(String[] args) {
        Room[] rooms1 = {
                new Room(1, false),
                new Room(2, true),
                new Room(3, false)
        };
        Room[] rooms2 = {
                new Room(4, false),
                new Room(5, true),
                new Room(6, true)
        };
        Room[] rooms3 = {
                new Room(7, true),
                new Room(8, false)
        };

        Flat[] flats1 = {
                new Flat(1, rooms1),
                new Flat(2, rooms2)
        };
        Flat[] flats2 = {
                new Flat(3, rooms3)
        };

        Floor[] floors = {
                new Floor(1, flats1),
                new Floor(2, flats2)
        };

        House house = new House(17, floors);

        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
    }
}




