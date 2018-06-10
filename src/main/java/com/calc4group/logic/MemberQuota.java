package com.calc4group.logic;

import com.calc4group.dao.Member;
import com.calc4group.dao.ShareTypeEnum;

public class MemberQuota {


    private ShareTypeEnum type;
    private Member member;
    private Double value;

    public MemberQuota(ShareTypeEnum type, Member member, Double value) {
        this.type = type;
        this.member = member;
        this.value = value;
    }

    //    public MemberQuota(ParticipationType equal, Member member, int i) {
//    }

    public ShareTypeEnum getType() {
        return type;
    }

    public void setType(ShareTypeEnum type) {
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
