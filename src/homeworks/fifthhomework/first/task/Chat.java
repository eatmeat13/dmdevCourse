package homeworks.fifthhomework.first.task;

public class Chat {
    private String name;
    private int countOfMembers;

    public Chat(String name, int countOfMembers) {
        this.name = name;
        this.countOfMembers = countOfMembers;
    }

    public String getName() {
        return name;
    }

    public int getCountOfMembers() {
        return countOfMembers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", countOfMembers=" + countOfMembers +
                '}';
    }
}
