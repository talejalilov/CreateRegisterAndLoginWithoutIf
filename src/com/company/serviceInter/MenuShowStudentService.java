package com.company.serviceInter;

import com.company.Config;
import com.company.bean.Student;
import com.company.servicemenu.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void process() {
        Student[] allStudent = Config.instance().getStudents();
        for(int i=0;i<allStudent.length;i++){
            System.out.println(allStudent[i]);

        }
    }
}
