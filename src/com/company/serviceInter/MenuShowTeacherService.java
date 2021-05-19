package com.company.serviceInter;

import com.company.Config;
import com.company.bean.Student;
import com.company.bean.Teacher;
import com.company.servicemenu.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
        public void process() {
            Teacher[] allTeacher = Config.instance().getTeachers();
            for(int i=0;i<allTeacher.length;i++){
                System.out.println(allTeacher[i]);
            }
    }
}
