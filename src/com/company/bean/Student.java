package com.company.bean;

public class Student extends Person{

    private String className;
    private int scholarship;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return
                "className='" + className + '\'' +
                ", scholarship=" + scholarship
                ;
    }
}
