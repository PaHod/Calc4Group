package com.calc4group.logic;

import com.calc4group.dao.Member;

public class MemberQuota {


    private ParticipationType type;
    private Member member;
    private Double value;

    public MemberQuota(ParticipationType type, Member member, Double value) {
        this.type = type;
        this.member = member;
        this.value = value;
    }

    //    public MemberQuota(ParticipationType equal, Member member, int i) {
//    }

    public ParticipationType getType() {
        return type;
    }

    public void setType(ParticipationType type) {
        this.type = type;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
