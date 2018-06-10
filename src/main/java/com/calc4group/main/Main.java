package com.calc4group.main;

import com.calc4group.dao.UsersEntity;
import com.calc4group.utils.HibernateSessionFactory;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {


        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername("PaHod");
        usersEntity.setEmail("pahod@pahod.net");
        usersEntity.setPassword("1234");

        session.save(usersEntity);
        session.getTransaction().commit();
        session.close();


//        Member mainMember = new Member();
//        mainMember.setId(0);
//        mainMember.setName("PaHod");
//        mainMember.setEmail("pahod@pahod.net");
//
//        CalcController calcController = new CalcController(mainMember);
//        calcController.createGroup("Georgia");
//
//        Reporter reporter = new Reporter(calcController.getGroupEvent());
//        reporter.calculate();


    }
}
