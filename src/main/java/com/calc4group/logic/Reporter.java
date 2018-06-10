package com.calc4group.logic;

import com.calc4group.dao.Expense;
import com.calc4group.dao.GroupEvent;
import com.calc4group.dao.Member;
import com.calc4group.dao.ShareTypeEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.calc4group.dao.ShareTypeEnum.*;


public class Reporter {
    private GroupEvent groupEvent;
    private final List<Member> members;
    private double totalAmount;
    private Map<Member, Double> amounPerMemberMap;

    public Reporter(GroupEvent groupEvent) {
        amounPerMemberMap = new HashMap<Member, Double>();
        this.groupEvent = groupEvent;
        members = groupEvent.getMembers();

        for (Member member : members) {
            amounPerMemberMap.put(member, 0d);
        }

    }

    public void calculate() {
        for (Expense expense : groupEvent.getExpenses()) {
            Member whoPaid = expense.getWhoPaid();
            double expenseAmount = expense.getAmount();
            List<MemberQuota> forWhomList = expense.getForWhom();
            for (MemberQuota memberQuota : forWhomList) {
                ShareTypeEnum type = memberQuota.getType();
                if (EQUAL.equals(type)) {
                    double quota = -expenseAmount / forWhomList.size();
                    addAmountPerMwmber(memberQuota.getMember(), quota);
                } else if (PERCENTE.equals(type)) {
                } else if (AMOUNT.equals(type)) {
                } else if (EQUAL_AND_AMOUNT.equals(type)) {
                }

            }
            addAmountPerMwmber(whoPaid, expenseAmount);
        }
        print();
    }

    private void print() {

    }

    private void addAmountPerMwmber(Member whoPaid, double amountToAdd) {
        Double prevSum = amounPerMemberMap.get(whoPaid);
        amounPerMemberMap.put(whoPaid, (prevSum + amountToAdd));
    }
}
