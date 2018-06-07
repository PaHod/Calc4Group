package com.calc4group.main;

import com.calc4group.dao.Member;
import com.calc4group.logic.CalcController;
import com.calc4group.logic.Reporter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Member mainMember = new Member();
        mainMember.setId(0);
        mainMember.setName("PaHod");
        mainMember.setEmail("pahod@pahod.net");

        CalcController calcController = new CalcController(mainMember);
        calcController.createGroup("Georgia");

        Reporter reporter = new Reporter(calcController.getGroupEvent());
        reporter.calculate();



    }
}
