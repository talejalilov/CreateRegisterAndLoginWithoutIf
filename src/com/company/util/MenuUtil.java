package com.company.util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {

        System.out.println("please select menu: ");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();

        Menu selectMenu = Menu.find(selectedMenu);
        selectMenu.process();
    }

    public static void processMenu(Menu menu) {

        menu.process();
    }
}
