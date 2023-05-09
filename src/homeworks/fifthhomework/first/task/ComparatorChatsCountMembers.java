package homeworks.fifthhomework.first.task;

import java.util.Comparator;

public class ComparatorChatsCountMembers implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o1.getCountOfMembers(), o2.getCountOfMembers());
    }
}
