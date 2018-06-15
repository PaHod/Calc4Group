package com.calc4group.logic;

import java.util.ArrayList;
import java.util.List;

public class CalcController {

//    private GroupEvent groupEvent;
//    private UserEntity currentUserEntity;

//    public CalcController(UserEntity currentUserEntity) {
//        this.currentUserEntity = currentUserEntity;
//    }

//    public void createGroup(String name) {
//        groupEvent = new GroupEvent();
//        groupEvent.setUserEntities(new ArrayList<UserEntity>());
//        groupEvent.setExpenses(new ArrayList<Expense>());
//        groupEvent.setName(name);
//        groupEvent.setMainUserEntity(currentUserEntity);
//        groupEvent.getUserEntities().add(currentUserEntity);

//        for (int i = 0; i < 4; i++) {
//            UserEntity userEntity = new UserEntity();
//            userEntity.setUserId(i);
//            userEntity.setUsername("UserEntity" + i);
//            userEntity.setEmail("UserEntity" + i + "@pahod.net");
//            addUser(userEntity);
//        }


//        for (int k = 0; k < 10; k++) {
//            Expense exp = createExp();
//            for (int i = 0; i < groupEvent.getUserEntities().size(); i++) {
//                UserEntity userEntity = groupEvent.getUserEntities().get(i);
//                MemberQuota memberQuota = new MemberQuota(EQUAL, userEntity, 0d);
//                exp.getForWhom().add(memberQuota);
//            }
//            exp.setAmount((double) (k * 10));
//            groupEvent.getExpenses().add(exp);
//        }


//    }
//
//    private Expense createExp() {
//        Expense expense = new Expense();
//        List<MemberQuota> memberQuotas = new ArrayList<MemberQuota>();
//        expense.setForWhom(memberQuotas);
//        return expense;
//    }

//    private void addUser(UserEntity userEntity) {
//        groupEvent.getUserEntities().add(userEntity);
//    }

//    public GroupEvent getGroupEvent() {
//        return groupEvent;
//    }

//    public void setGroupEvent(GroupEvent groupEvent) {
//        this.groupEvent = groupEvent;
//    }
}
