package fifthhomework.first.task;

import java.util.List;

public class SecondChat {
    private String name;
    private List<Member> memberList;

    public SecondChat(String name, List<Member> memberList) {
        this.name = name;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    @Override
    public String toString() {
        return "SecondChat{" +
                "name='" + name + '\'' +
                ", memberList=" + memberList +
                '}';
    }
}
