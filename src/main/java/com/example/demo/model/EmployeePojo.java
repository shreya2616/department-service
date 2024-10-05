package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class EmployeePojo {
    private long employeeId;
    private String name;
    private long deptId;

    public EmployeePojo(long employeeId, String name, long deptId) {
        this.employeeId = employeeId;
        this.name = name;
        this.deptId = deptId;
    }

    public EmployeePojo() {
    }
}
