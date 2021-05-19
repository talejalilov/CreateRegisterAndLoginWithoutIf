package com.company.util;

import com.company.Config;
import com.company.serviceInter.*;
import com.company.servicemenu.MenuLoginServiceInter;
import com.company.servicemenu.MenuRegisterServiceInter;
import com.company.servicemenu.MenuService;

public enum Menu {

    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"Add Teacher",new MenuAddTeacherService()),
    ADD_STUDENT(4,"Add Student",new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5,"Show All Teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6,"Show All Student", new MenuShowStudentService()),
    UNKNOWN();

    private int number;
    private String label;
    private MenuService service;

    Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    Menu() {
    }

    @Override
    public String toString() {
        return number +"." +  label;
    }

    public String getLabel() {
        return label;
    }


    public void process(){
        service.process();
       MenuUtil.showMenu();
    }

    public int getNumber(){
        return this.number;
    }

    public static Menu find(int number){
        Menu[] menus =  Menu.values();

        for(int i=0;i<menus.length;i++) {
            if(menus[i].getNumber() ==number){
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu(){


        Menu[] menus =  Menu.values();
        for(int i=0;i<menus.length;i++) {
            if(menus[i]!=UNKNOWN){

          if(menus[i] ==LOGIN || menus[i] == REGISTER){
              if(!Config.isLoggedIn()){
              System.out.println(menus[i]);
          }
          }
          else if (Config.isLoggedIn()){
              System.out.println(menus[i]);
          }
        }
        }
    }



}
