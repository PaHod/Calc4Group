package com.calc4group.dao;

import com.calc4group.logic.MemberQuota;

import java.util.List;

public class Expense {

    private int id;
    private Member whoPaid;
    private List<MemberQuota> forWhom;
    private double amount;

    public Expense() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getWhoPaid() {
        return whoPaid;
    }

    public void setWhoPaid(Member whoPaid) {
        this.whoPaid = whoPaid;
    }

    public List<MemberQuota> getForWhom() {
        return forWhom;
    }

    public void setForWhom(List<MemberQuota> forWhom) {
        this.forWhom = forWhom;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
