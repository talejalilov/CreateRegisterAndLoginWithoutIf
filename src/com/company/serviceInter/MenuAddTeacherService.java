package com.company.serviceInter;

import com.company.Config;
import com.company.bean.Student;
import com.company.bean.Teacher;
import com.company.servicemenu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {




    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendStudent(t);


    }
}
