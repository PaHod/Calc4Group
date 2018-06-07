package com.calc4group.dao;

import java.util.ArrayList;
import java.util.List;

public class GroupEvent {

    private int id;
    private String name;
    private List<Member> members;
    private Member mainMember;
    private List<Expense> expenses;


    public GroupEvent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void setMainMember(Member mainMember) {
        this.mainMember = mainMember;
    }

    public Member getMainMember() {
        return mainMember;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
