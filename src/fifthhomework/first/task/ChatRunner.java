package fifthhomework.first.task;
/*
Задание 1
Дан список чатов.
Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

Задача:

- Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
- Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
- Также предоставить сортировку чатов по названию по умолчанию.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatRunner {

    public static void main(String[] args) {
        Chat chat = new Chat("bcd", 100000);
        Chat chat1 = new Chat("abcd", 10);
        Chat chat2 = new Chat("abcd", 1);
        Chat chat3 = new Chat("abcd", 300000);
        Chat chat4 = new Chat("C", 200000);
        Chat chat5 = new Chat("B", 200000);
        Chat chat6 = new Chat("A", 200000);
        List<Chat> chats = new ArrayList<>();
        chats.add(chat);
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        chats.add(chat4);
        chats.add(chat5);
        chats.add(chat6);
        System.out.println(chats);
        System.out.println("------");
        System.out.println(removeChatsWithCountMembersLessThousand(chats));
        System.out.println("------");
        System.out.println(chats);
        System.out.println("------");
        chats.sort( new ComparatorChatsCountMembers().thenComparing(new ComparatorChatsName()));
        System.out.println(chats);
    }

    public static List<Chat> removeChatsWithCountMembersLessThousand(List<Chat> chats) {
        List<Chat> removeChats = chats;
        Iterator<Chat> iterator = removeChats.iterator();
        while(iterator.hasNext()){
            Chat next = iterator.next();
            if  (next.getCountOfMembers() < 1000 ){
                iterator.remove();

            }
        }
        return removeChats;
    }


}
