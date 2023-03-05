package fifthhomework.first.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
 * будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 *
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 *
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class SecondChatRunner {
    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();
        List<Member> members1 = new ArrayList<>();
        List<Member> members2 = new ArrayList<>();
        members.add(new Member(1,"Leonid",21));
        members.add(new Member(2,"Leonid1",20));
        members.add(new Member(3,"Leonid2",19));
        members.add(new Member(4,"Leonid3",18));
        members.add(new Member(5,"Leonid3",17));
        members.add(new Member(6,"Leonid4",16));
        members.add(new Member(7,"Leonid5",15));
        members1.add(new Member(8,"Alex",15));
        members1.add(new Member(9,"Alex1",15));
        members1.add(new Member(10,"Alex2",15));
        members1.add(new Member(11,"Alex3",15));
        members2.add(new Member(12,"Ivan",10));
        members2.add(new Member(13,"Ivan1",90));


        SecondChat secondChat = new SecondChat("A", members);
        SecondChat secondChat1 = new SecondChat("B", members1);
        SecondChat secondChat2 = new SecondChat("C", members2);

        List<SecondChat> secondChats = new ArrayList<>();
        secondChats.add(secondChat);
        secondChats.add(secondChat1);
        secondChats.add(secondChat2);

        System.out.println(secondChats);
        System.out.println("------");
        List<Member> allChatsMemberslist = new ArrayList<>();
        int countOfMembersYoungerEighteen = 0;
        int sumOfEightMembersWhoYoungerEighteen = 0;
        Iterator<SecondChat> secondChatIterator = secondChats.iterator();
        while(secondChatIterator.hasNext()){
            Iterator<Member> memberIterator = secondChatIterator.next().getMemberList().iterator();
            while (memberIterator.hasNext()){
                Member nextMember = memberIterator.next();
                if (nextMember.getAge() > 18){
                    allChatsMemberslist.add(nextMember);
                } else {
                   sumOfEightMembersWhoYoungerEighteen += nextMember.getAge();
                   countOfMembersYoungerEighteen++;
                }
            }
        }
        double averageAge = (double) sumOfEightMembersWhoYoungerEighteen/countOfMembersYoungerEighteen;
        System.out.println(allChatsMemberslist);
        System.out.println("------");
        System.out.println(averageAge);
        System.out.println("------");
        System.out.println("------");
        System.out.println(secondChats);
        System.out.println("------");

}
}
