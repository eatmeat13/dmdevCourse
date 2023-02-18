package thirdHomework.introduction.oop;

public class Home {
    private final int homeNumber;
    private final int[] floor;

    public Home(int homeNumber, int[] floor) {
        this.homeNumber = homeNumber;
        this.floor = floor;
    }

        public void ptint() {
            System.out.println("HomeNumber: " + homeNumber + " number of floors: " + floor.length);
        }

}
