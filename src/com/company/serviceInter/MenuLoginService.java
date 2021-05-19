package com.company.serviceInter;

import com.company.Config;
import com.company.servicemenu.MenuLoginServiceInter;
import com.company.servicemenu.MenuService;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password: ");
        String password = sc2.nextLine();

        if(!(username.equals("user") && password.equals("11111"))){
            throw new IllegalArgumentException("user or password is invalid");

        }

        Config.setLoggedIn(true);
    }
}
