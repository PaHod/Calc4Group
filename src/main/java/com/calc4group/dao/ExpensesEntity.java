package com.calc4group.dao;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "expenses", schema = "calc4group", catalog = "")
public class ExpensesEntity {
    private int expenseId;
    private Integer createdBy;
    private Integer paidBy;
    private Date createDate;
    private Integer resolved;

    @Id
    @Column(name = "expense_id", nullable = false)
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    @Basic
    @Column(name = "created_by", nullable = true)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "paid_by", nullable = true)
    public Integer getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Integer paidBy) {
        this.paidBy = paidBy;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "resolved", nullable = true)
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

        ExpensesEntity that = (ExpensesEntity) o;

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
}
