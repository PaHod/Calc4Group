package com.calc4group.dao;

import javax.persistence.*;

@Entity
@Table(name = "expense_participants", schema = "calc4group", catalog = "")
public class ExpenseParticipantsEntity {
    private Integer expense_participant_id;
    private int paidFor;
    private ShareTypeEnum shareType;
    private String amount;
    private Integer expenseId;

    @Id
    public Integer getExpense_participant_id() {
        return expense_participant_id;
    }

    public void setExpense_participant_id(Integer expense_participant_id) {
        this.expense_participant_id = expense_participant_id;
    }

    @Basic
    @Column(name = "paid_for", nullable = false)
    public int getPaidFor() {
        return paidFor;
    }

    public void setPaidFor(int paidFor) {
        this.paidFor = paidFor;
    }

    @Basic
    @Column(name = "share_type", nullable = true)
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    @Basic
    @Column(name = "amount", nullable = false, length = -1)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "expense_id", nullable = true)
    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpenseParticipantsEntity that = (ExpenseParticipantsEntity) o;

        if (paidFor != that.paidFor) return false;
        if (shareType != that.shareType) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (expenseId != null ? !expenseId.equals(that.expenseId) : that.expenseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paidFor;
        result = 31 * result + (shareType != null ? shareType.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (expenseId != null ? expenseId.hashCode() : 0);
        return result;
    }


}
