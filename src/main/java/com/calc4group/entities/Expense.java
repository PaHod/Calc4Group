package com.calc4group.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "expense", schema = "calc4group")
public class Expense {
    private int expenseId;
    private Integer createdBy;
    private Integer paidBy;
    private Date createDate;
    private Integer resolved;

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    @Id
    @Column(name = "expenseId", nullable = false)
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    @Basic
    @Column(name = "createdBy")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "paidBy")
    public Integer getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Integer paidBy) {
        this.paidBy = paidBy;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "resolved")
    public Integer getResolved() {
        return resolved;
    }

    public void setResolved(Integer resolved) {
        this.resolved = resolved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense that = (Expense) o;

        if (expenseId != that.expenseId) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (paidBy != null ? !paidBy.equals(that.paidBy) : that.paidBy != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (resolved != null ? !resolved.equals(that.resolved) : that.resolved != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = expenseId;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (paidBy != null ? paidBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (resolved != null ? resolved.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", createdBy=" + createdBy +
                ", paidBy=" + paidBy +
                ", createDate=" + createDate +
                ", resolved=" + resolved +
                '}';
    }
}
