package com.company.serviceInter;

import com.company.Config;
import com.company.bean.Student;
import com.company.servicemenu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);



    }
}
