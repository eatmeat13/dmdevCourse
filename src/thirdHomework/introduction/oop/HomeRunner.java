package thirdHomework.introduction.oop;

public class HomeRunner {
    public static void main(String[] args) {
        int[] flats = new int[4];
        int[] floors = new int[19];
        Floor floor = new Floor(8,flats);
        Home home = new Home(5,floors );
        home.ptint();
        floor.ptint();

    }



}
