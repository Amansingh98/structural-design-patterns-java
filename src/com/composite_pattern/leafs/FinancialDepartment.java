package com.composite_pattern.leafs;

import com.composite_pattern.component.Department;

public class FinancialDepartment implements Department {
    private Integer id;
    private String name;

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
