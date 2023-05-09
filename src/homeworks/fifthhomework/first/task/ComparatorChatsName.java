package homeworks.fifthhomework.first.task;

import java.util.Comparator;

public class ComparatorChatsName implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
