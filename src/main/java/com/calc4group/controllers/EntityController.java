package com.calc4group.controllers;

import com.calc4group.entities.GroupEvent;
import com.calc4group.entities.User;
import com.calc4group.utils.HibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EntityController {


    private final SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();


    public void addUser(String username, String email, String pass) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(pass);
        saveToDataBase(user);
        System.out.println("user added " + user);
    }

    public void addGroup(String groupName) {
        GroupEvent groupEvent = new GroupEvent();
        groupEvent.setGroupName(groupName);
        saveToDataBase(groupEvent);
        System.out.println("group added " + groupEvent);

    }

    private void saveToDataBase(Object obj) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }

    private Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addUserByNameToGroupByName(String userName, String groupName) {
        User userByName = getUserByName(userName);
        GroupEvent groupByName = getGroupByName(groupName);

        System.out.println("user " + getUserByName(userName) + " and group " + getGroupByName(groupName));
        return false;
    }

    private GroupEvent getGroupByName(String groupName) {
        Session session = getSession();
        Query query = session.createQuery("from GroupEvent where groupName = '" + groupName + "'");
        List list = query.list();
//        session.getTransaction().commit();
        session.close();
        if (!list.isEmpty() && (list.size() == 1)) {
            return ((GroupEvent) list.get(0));
        }
        return null;
    }

    private User getUserByName(String userName) {
        Session session = getSession();
//        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User where username = '" + userName + "'");
        List list = query.list();
//        session.getTransaction().commit();
        session.close();
        if (!list.isEmpty() && (list.size() == 1)) {
            return ((User) list.get(0));
        }
        return null;
    }
}
