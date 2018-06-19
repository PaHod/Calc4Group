package com.calc4group.main;

import com.calc4group.controllers.EntityController;

public class Main {
    public static void main(String[] args) {

        EntityController entityController = new EntityController();
        entityController.addUser("PaHod", "pahod@pahod.net", "1234");
        entityController.addUser("PaHod1", "pahod1@pahod.net", "1234");
        entityController.addUser("PaHod2", "pahod2@pahod.net", "2234");
        entityController.addUser("PaHod3", "pahod3@pahod.net", "3234");
        entityController.addUser("PaHod4", "pahod4@pahod.net", "3234");
        entityController.addGroup("Borzhava2018");
        entityController.addUserByNameToGroupByName("PaHod", "Borzhava2018");

    }
}
