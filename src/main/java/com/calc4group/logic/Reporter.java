package com.calc4group.logic;


public class Reporter {
//    private GroupEvent groupEvent;
//    private final List<UserEntity> userEntities;
//    private double totalAmount;
//    private Map<UserEntity, Double> amounPerMemberMap;
//
//    public Reporter(GroupEvent groupEvent) {
//        amounPerMemberMap = new HashMap<UserEntity, Double>();
//        this.groupEvent = groupEvent;
//        userEntities = groupEvent.getUserEntities();
//
//        for (UserEntity userEntity : userEntities) {
//            amounPerMemberMap.put(userEntity, 0d);
//        }
//
//    }
//
//    public void calculate() {
//        for (Expense expense : groupEvent.getExpenses()) {
//            UserEntity whoPaid = expense.getWhoPaid();
//            double expenseAmount = expense.getAmount();
//            List<MemberQuota> forWhomList = expense.getForWhom();
//            for (MemberQuota memberQuota : forWhomList) {
//                ShareTypeEnum type = memberQuota.getType();
//                if (EQUAL.equals(type)) {
//                    double quota = -expenseAmount / forWhomList.size();
//                    addAmountPerMwmber(memberQuota.getUserEntity(), quota);
//                } else if (PERCENTE.equals(type)) {
//                } else if (AMOUNT.equals(type)) {
//                } else if (EQUAL_AND_AMOUNT.equals(type)) {
//                }
//
//            }
//            addAmountPerMwmber(whoPaid, expenseAmount);
//        }
//        print();
//    }
//
//    private void print() {
//
//    }
//
//    private void addAmountPerMwmber(UserEntity whoPaid, double amountToAdd) {
//        Double prevSum = amounPerMemberMap.get(whoPaid);
//        amounPerMemberMap.put(whoPaid, (prevSum + amountToAdd));
//    }
}
