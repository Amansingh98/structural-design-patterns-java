package com.composite_pattern.composite_element;

import com.composite_pattern.component.Department;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName(){
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department){
        childDepartments.add(department);
    }

    public void removeDepartment(Department department){
        childDepartments.remove(department);
    }
}
