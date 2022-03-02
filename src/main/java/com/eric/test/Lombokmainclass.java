package com.eric.test;

import com.eric.test.model.EmployeeModel;

public class Lombokmainclass {

    public static void main(String[] args) {

        EmployeeModel emp=new EmployeeModel();

        emp.setCompany("eric");
        emp.setEmployeeId(101);
        emp.setName("Ravi");
        emp.setEmailId("abe@gmail.com");
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.toString());
    }
}
