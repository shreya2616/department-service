package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class DepartmentPojo {

    private long deptId;
    private String deptName;
    private List<EmployeePojo> allEmployees;

    public DepartmentPojo(long deptId, String deptName, List<EmployeePojo> allEmployees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.allEmployees = allEmployees;
    }

    public DepartmentPojo() {
    }
}
