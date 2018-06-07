package com.calc4group.logic;

import com.calc4group.dao.Expense;
import com.calc4group.dao.GroupEvent;
import com.calc4group.dao.Member;

import java.util.ArrayList;
import java.util.List;

public class CalcController {

    private GroupEvent groupEvent;
    private Member currentMember;

    public CalcController(Member currentMember) {
        this.currentMember = currentMember;
    }

    public void createGroup(String name) {
        groupEvent = new GroupEvent();
        groupEvent.setMembers(new ArrayList<Member>());
        groupEvent.setExpenses(new ArrayList<Expense>());
        groupEvent.setName(name);
        groupEvent.setMainMember(currentMember);
        groupEvent.getMembers().add(currentMember);

        for (int i = 0; i < 4; i++) {
            Member member = new Member();
            member.setId(i);
            member.setName("Member" + i);
            member.setEmail("Member" + i + "@pahod.net");
            addUser(member);
        }


        for (int k = 0; k < 10; k++) {
            Expense exp = createExp();
            for (int i = 0; i < groupEvent.getMembers().size(); i++) {
                Member member = groupEvent.getMembers().get(i);
                MemberQuota memberQuota = new MemberQuota(ParticipationType.EQUAL, member, 0d);
                exp.getForWhom().add(memberQuota);
            }
            exp.setAmount((double) (k * 10));
            groupEvent.getExpenses().add(exp);
        }


    }

    private Expense createExp() {
        Expense expense = new Expense();
        List<MemberQuota> memberQuotas = new ArrayList<MemberQuota>();
        expense.setForWhom(memberQuotas);
        return expense;
    }

    private void addUser(Member member) {
        groupEvent.getMembers().add(member);
    }

    public GroupEvent getGroupEvent() {
        return groupEvent;
    }

    public void setGroupEvent(GroupEvent groupEvent) {
        this.groupEvent = groupEvent;
    }
}
