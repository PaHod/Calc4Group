package com.calc4group.entities;

import javax.persistence.*;

@Entity
@Table(name = "group_event", schema = "calc4group")
public class GroupEvent {
    private int groupId;
    private String groupName;

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Id
    @Column(name = "groupId", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "groupName", length = 25)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEvent that = (GroupEvent) o;

        if (groupId != that.groupId) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GroupEvent{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
